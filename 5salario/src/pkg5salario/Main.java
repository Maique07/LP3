/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5salario;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class Main {

    /**
     * @param args the command line arguments
     *//*Leia 5 salários em um vetor. Após toda a entrada ter sido realizada, leia o valor de um
reajuste. Em seguida exiba todos os salários já reajustados.*/

    public static void main(String[] args) {
        float vetsal[] = new float[5], salreaj[] = new float[5], salfinal[] = new float[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("informe o salario: " + (i + 1));
            vetsal[i] = s.nextFloat();
        }
        System.out.println("informe a porcentagem do reajusto: ");
        float x = s.nextFloat();
        for (int i = 0; i < 5; i++) {
            salreaj[i] = (vetsal[i] * (x / 100));
            salfinal[i] = (vetsal[i] + salreaj[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Salario reajustado\nSalario: " + (i + 1) + ": " + salfinal[i]);
        }
    }

}
