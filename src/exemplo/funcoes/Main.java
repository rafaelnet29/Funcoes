package exemplo.funcoes;

import java.text.MessageFormat;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcao = 0;
        int numero = 0;
        double price, percent;
        do {
            // Ínicio do Menu
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"""
                                                                  -->> Informe sua Opção:
                                                                 1 - FATORIAL
                                                                 2 - PAR ou IMPAR
                                                                 3 - DESCONTO
                                                                 4 - JUROS
                                                                 0 - SAIR""", "Menu", 1));
            if (opcao == 1) {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Número:", "FATORIAL", 1));
                JOptionPane.showMessageDialog(null, MessageFormat.format("O Fatorial de {0} é: {1}", numero, new Funcoes(numero).RecursivaFatorial()), "FATORIAL", 1);
            } else if (opcao == 2) {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Número:", "PAR ou IMPAR", 1));
                new Funcoes(numero).FuncaoParOuImpar();
            } else if (opcao == 3) {
                price = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço do produto:", "DESCONTO", 1));
                percent = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a porcentagen de desconto:", "DESCONTO", 1));
                new Funcoes(price, percent).aplicarDesconto();
            } else if (opcao == 4) {
                new Funcoes(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o capital aplicado:", "JUROS SIMPLES", 1)),
                        Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a taxa de juros:", "JUROS SIMPLES", 1)),
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tempo:", "JUROS SIMPLES", 1))).juroSimples();
            } else {
                JOptionPane.showMessageDialog(null, "Até a próxima!", "Menu", 1);
            }

        } while (opcao != 0);
    }
}