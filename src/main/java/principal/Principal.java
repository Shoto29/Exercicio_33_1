package principal;

import javax.swing.JOptionPane;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Principal {

    public static void main(String[] args) {
        int op = -1;

        PessoaFisica novo = new PessoaFisica();
        PessoaJuridica novo1 = new PessoaJuridica();

        while (op != 99) {
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Menu de op\u00e7\u00f5es
                                                              1 - Cadastrar Pessoa Fisica
                                                              2 - Cadastrar Pessoa Juridica
                                                              3 - Mostrar Cadastros
                                                              4 - Quem fatura mais
                                                              99 - Sair"""));
            switch (op) {
                case 1 -> {
                    novo.leitura();
                    break;
                }

                case 2 -> {
                    novo1.leitura();
                    break;
                }
                case 3 -> {
                    novo.imprimir();
                    novo1.imprimir();
                    break;
                }
                case 4 ->{
                    if(novo.getSalario() < novo1.getFaturamento()){
                        JOptionPane.showMessageDialog(null,"A empresa fatura mais que a pessoa fisica");
                    }else if(novo.getSalario()> novo1.getFaturamento()){
                        JOptionPane.showMessageDialog(null,"A pessoa fisica fatura mais que a empresa");

                    }else{
                        JOptionPane.showMessageDialog(null,"A empresa fatura igual a pessoa fisica");

                    }
                }

            }

        }
    }

}
