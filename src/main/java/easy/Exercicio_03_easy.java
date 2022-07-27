package easy;

import javax.swing.*;

public class Exercicio_03_easy { //Inicio algoritmo

    static String primeiroValor, segundoValor;

    public static void main(String[] args) {
        primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        segundoValor = JOptionPane.showInputDialog("Digite o segundo valor: ");

        System.out.println("O primeiro valor digitado é: " + segundoValor);
        System.out.println("O segundo valor digitado é: " + primeiroValor);
    }

} //Fim algoritmo
