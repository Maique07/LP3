/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prefeitura;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class Prefeitura {

    /**
     * @param y
     * @return
     */
    public static int mediafilhos(int[] y) {
        int s = 0, somasal = 0, x = 0;
        for (int i = 0; i < y.length; i++) {
            s += y[i];
            x++;
        }
        int media = s / x;

        return media;
    }

    public static float mediasalario(float[] sal) {
        float media = 0, soma = 0;
        int x = 0;
        for (int i = 0; i < sal.length; i++) {
            soma += sal[i];
            x++;
        }
        media = soma / x;
        return media;

    }

    public static float maiorsalario(float[] sal) {
        float salmaior = 0;
        for (int i = 0; i < sal.length; i++) {
            if (sal[i] > salmaior) {
                salmaior = sal[i];
            }
        }
        return salmaior;

    }

    public static float percentual(float[] sal) {
         int x = 0;
         for(int i = 0; i < sal.length; i++){
             if(sal[i] <= 550.0){
                 x++;
             }
         }
         float p = (float) ((x*100)/sal.length);
        return p;

    }

    public static void main(String[] args) {
        float media = 0;
        System.out.println("informe a quantidade de pessoas: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        float salario[] = new float[x];
        int numfilhos[] = new int[x];
        float mediaSa = 0;
        float salmaior = 0;
        for (int i = 0; i < x; i++) {
            System.out.println("informe o seu salário: ");
            salario[i] = s.nextFloat();
            System.out.println("informe a quantidade de filhos: ");
            numfilhos[i] = s.nextInt();
        }
        mediaSa = mediasalario(salario);
        salmaior = maiorsalario(salario);
        float p = percentual(salario);
        int mediafilhos = mediafilhos(numfilhos);
        System.out.println("A media dos filhos na cidade é: " + mediafilhos
                + "\nMedia dos salarios na cidade: " + mediaSa
                + "\nMaior salario da cidade é: " + salmaior
                + "\npercentual de pessoas que recebem abaixo de 550 é: " + p + "%");
    }

}
