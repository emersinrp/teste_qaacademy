package easy;

import javax.swing.*;

public class Exercicio_09_easy { //Inicio Algoritmo

    static int numeroDigitado, i=1, resultado;

    public static void main(String[] args) {

        numeroDigitado  = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        while (i <= 10 ) {
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + " X " + i + " = " + resultado);
            i = i + 1; //soma do i +1 pra entrar em loop infinito
        }// Fim Enquanto
    }
} //Fim algoritmo