/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interseccção;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Interseccção {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe a quantidade de numero a serem digitados: ");
        int x = s.nextInt();
        int vetA[] = new int[x], vetB[] = new int[x];

        System.out.println("insira os " + x + " numeros");
        for (int i = 0; i < x; i++) {
            vetA[i] = s.nextInt();
        }
        System.out.println("insira outros " + x + " numeros");
        for (int i = 0; i < x; i++) {
            vetB[i] = s.nextInt();
        }
        //int vetInter[];
        System.out.println("numero iguais: ");
        boolean igual = false;
        for (int i = 0; i < x; i++) {
            for (int y = 0; y < x; y++) {
                if (vetA[i] == vetB[y]) {
                      System.out.println(vetA[i]); 
                      igual = true;
                    break;
                }
            }
        }
        if (!igual){
            System.out.println("nao tem numero iguais");
        }
    }
    
}
