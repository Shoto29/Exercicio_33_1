package model;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Clientes {
    private String CNPJ;
    private String IE;
    private double Faturamento;

    public PessoaJuridica(){
        this("","","","","",0);
    }
    
    public PessoaJuridica(String CNPJ, String IE, double Faturamento) {
        this.CNPJ = CNPJ;
        this.IE = IE;
        this.Faturamento = Faturamento;
    }

    public PessoaJuridica(String Nome, String Endereço, String Telefone, String CNPJ, String IE, double Faturamento) {
        super(Nome, Endereço, Telefone);
        this.CNPJ = CNPJ;
        this.IE = IE;
        this.Faturamento = Faturamento;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public double getFaturamento() {
        return Faturamento;
    }

    public void setFaturamento(double Faturamento) {
        this.Faturamento = Faturamento;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPessoaJuridica \nCNPJ = " + CNPJ + " \nIE = " + IE + " \nFaturamento = " + Faturamento;
    }
    
    @Override
    public void leitura(){
        super.leitura();
        setCNPJ(JOptionPane.showInputDialog(null,"Digite o CNPJ:"));
        setIE(JOptionPane.showInputDialog(null,"Digite a Inscrição Estadual:"));
        setFaturamento(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Faturamento mensal:")));
    }
    
    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null, toString());
    }
    
    
    
    
    
}
