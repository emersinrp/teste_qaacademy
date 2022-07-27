package easy;

import javax.swing.*;

public class Exercicio_10_easy { //inicio algoritmo

    static double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;

    public static void main(String[] args) {
        valorInvestimento  = Double.parseDouble(JOptionPane.showInputDialog("informe seu investimento: "));
        valorJuros = (10 * taxaJuros)* valorInvestimento;
        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor Investido: R$ "+ valorInvestimento);
        System.out.println("Valor Juros: R$ "+ valorJuros);
        System.out.println("Valor Total com Juros: R$ "+ valorTotal);
    }
} //Fim algoritmo
