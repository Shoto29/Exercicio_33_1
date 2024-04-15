package model;

import javax.swing.JOptionPane;

public class Clientes {

    private String Nome;
    private String Endereço;
    private String Telefone;

    public Clientes() {
        this("", "", "");
    }

    public Clientes(String Nome, String Endereço, String Telefone) {
        this.Nome = Nome;
        this.Endereço = Endereço;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String toString() {
        return "Clientes \nNome = " + Nome + " \nEndere\u00e7o = " + Endereço + " \nTelefone = " + Telefone;
    }

    public void leitura() {
        setNome(JOptionPane.showInputDialog(null, "Digite o nome:"));
        setEndereço(JOptionPane.showInputDialog(null, "Digite o endereço:"));
        setTelefone(JOptionPane.showInputDialog(null, "Digite o telefone"));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, toString());
    }

}
