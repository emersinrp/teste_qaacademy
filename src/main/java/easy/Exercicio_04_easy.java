package easy;

import javax.swing.*;

public class Exercicio_04_easy { //Inicio algoitmo

    static int numeroDigitado, resultado;

    public static void main(String[] args) {
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ")) ;
        resultado = numeroDigitado * 2;
        System.out.println("O dobro do valor digitado é: " + resultado);
    }
} // Fim algoritmo
