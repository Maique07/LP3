/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class Empresa {

    /**
     * @param idade
     * @return 
     */
    public static int maioridade(int[] idade) {
        int maiorIdade = -1;
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] >= maiorIdade) {
                maiorIdade = idade[i];
            }
        }
        return maiorIdade;

    }
     public static int menoridade(int[] idade) {
         int menorIdade = 100;
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] <= menorIdade) {
                menorIdade = idade[i];
            }
        }
        return menorIdade;
    }

    public static int mediaidade(int[] idade) {
        int media = 0;
        int s = 0;
        for(int i = 0; i < idade.length;i++){
           s += idade[i];
        }
        media = s/5;
        return media;

    }

    public static void main(String[] args) {
        int idade[] = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("informe sua idade");
            idade[i] = s.nextInt();
        }
        int maior = maioridade(idade);
        int menor = menoridade(idade);
        int media = mediaidade(idade);
        System.out.println("Maior idade: " + maior + "\nMenor Idade: " + menor + "\nMedia das idades: " + media);
    }

}
