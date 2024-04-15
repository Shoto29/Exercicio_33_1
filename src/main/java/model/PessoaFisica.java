package model;

import javax.swing.JOptionPane;

public class PessoaFisica extends Clientes {

    private String CPF;
    private String RG;
    private double Salario;

    public PessoaFisica() {
        this("", "", "", "", "", 0);
    }

    public PessoaFisica(String CPF, String RG, double Salario) {
        this.CPF = CPF;
        this.RG = RG;
        this.Salario = Salario;
    }

    public PessoaFisica(String Nome, String Endereço, String Telefone, String CPF, String RG, double Salario) {
        super(Nome, Endereço, Telefone);
        this.CPF = CPF;
        this.RG = RG;
        this.Salario = Salario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nPessoaFisica \nCPF = " + CPF + " \nRG = " + RG + " \nSalario = " + Salario;
    }

    @Override
    public void leitura() {
        super.leitura();
        setCPF(JOptionPane.showInputDialog(null, "Digite o CPF:"));
        setRG(JOptionPane.showInputDialog(null, "Digite o RG:"));
        setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário:")));
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, toString());
    }

}
