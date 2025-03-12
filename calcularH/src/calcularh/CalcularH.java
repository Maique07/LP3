/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularh;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class CalcularH {

    /**
     * @param args the command line arguments
     */
    /*Dados seis números inteiros representando dois intervalos de tempo (horas, minutos e
segundos), faça um programa para calcular a soma e a diferença desses intervalos.*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe o primeiro horario em horas, minutos e segundos: ");
        int HI = s.nextInt();
        int MI = s.nextInt();
        int SI = s.nextInt();
        System.out.println("informe o primeiro horario em horas, minutos e segundos: ");
        int Hf = s.nextInt();
        int Mf = s.nextInt();
        int Sf = s.nextInt();

        int somaH = HI + Hf;
        int somaM = MI + Mf;
        int somaS = SI + Sf;

        if (somaS > 60) {
            somaS -=60;
            somaM += 1;
        }
        if (somaM > 60) {
            somaM -= 60;
            somaH += 1;
        }

        int difH = Hf - HI;
        int difM = Mf - MI;
        int difS = Sf - SI;

        if (difS <= -1) {
            difS += 60;
            difM -= 1;        }
        if (difM <= -1) {
            difM +=60;
            difH -= 1;
        }
        if (difH <= -1) {
            difH += 24;
        }
        System.out.println("soma: "+somaH+"H"+somaM+"m"+somaS+"s");
        System.out.println("diferenca: "+difH+"H"+difM+"m"+difS+"s");
    }

}
