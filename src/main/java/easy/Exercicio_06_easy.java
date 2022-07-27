package easy;

import javax.swing.*;

public class Exercicio_06_easy { //Inicio algoritmo

    static double primeiraNota, segundaNota, mediaNotas;

    public static void main(String[] args) {
        primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("informe a primeira nota: "));
        segundaNota = Double.parseDouble(JOptionPane.showInputDialog("informe a segunda nota: "));
        mediaNotas = (primeiraNota + segundaNota) / 2;

        if (mediaNotas > 5) { //Inicio SE
            System.out.println("Aprovado");
        } // Fim SE
        else if (mediaNotas < 5) {
            System.out.println("Reprovado");
        }else {
            System.out.println("Ficou para exame");
        }
    }
} //Fim algoritmo
