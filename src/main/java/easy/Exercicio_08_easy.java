package easy;

import javax.swing.*;

public class Exercicio_08_easy { //Inicio algoritmo

    static double salario, salarioLiquido, impostoRenda;

    public static void main(String[] args) {

        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));

        if (salario <= 1903.98){
            impostoRenda =  0;
            salarioLiquido = salario  - impostoRenda;
        }
        if (salario >= 1903.99 && salario <= 2826.65) {
            impostoRenda =  (salario * 0.075) - 142.79;
            salarioLiquido = salario  - impostoRenda;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            impostoRenda =  (salario * 0.15) - 354.80;
            salarioLiquido = salario  - impostoRenda;
        }
        if (salario >= 3751.06 && salario <= 4664.68){
            impostoRenda =  650.00;
            salarioLiquido = salario  - impostoRenda;
        }
        if (salario > 4664.68) {
            impostoRenda =  (salario * 0.275) - 869.36;
            salarioLiquido = salario  - impostoRenda;
        }

        System.out.println("Seu Salario Bruto será: R$ "+ salario);
        System.out.println("Seu Salario Liquido será: R$ "+ salarioLiquido);
        System.out.println("O valor a ser pago de imposto de renda será: R$ "+ impostoRenda);

    }
} //Fim algoritmo
