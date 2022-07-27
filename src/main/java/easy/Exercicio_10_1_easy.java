package easy;

import javax.swing.*;

public class Exercicio_10_1_easy {

    static double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
    static int ano = 1;
    public static void main(String[] args) {

        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Informe seu investimento: "));

        while (ano <= 10){
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano = ano+1; //ano++
        }
        valorTotal = valorJuros+ valorInvestimento;

        System.out.println("Valor investido: R$ " + valorInvestimento);
        System.out.println("Valor Juros: R$ "+ valorJuros);
        System.out.println("Valor Total com Juros: R$ "+ valorTotal);
    }
}
