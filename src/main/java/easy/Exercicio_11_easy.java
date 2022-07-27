package easy;

import javax.swing.*;

public class Exercicio_11_easy {

    static int numeroDigitado, i=1;
    public static void main(String[] args) {

        numeroDigitado  = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        while (i<=100) {
            numeroDigitado  = numeroDigitado  + 2;
            System.out.println("O Total somado é: " + numeroDigitado);
            i++;
        }
    }
}
