/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class LIBRARY {

    /**
     * @param args the command line arguments
     */
    /*Uma livraria está fazendo uma promoção para pagamento à vista em que o comprador
pode escolher entre dois critérios de desconto:
a. Critério A: R$ 0,25 por livro + R$ 7,50 fixo.
b. Critério B: R$ 0,50 por livro + R$ 2,50 fixo.
Faça um programa em que o usuário digita a quantidade de livros que deseja comprar e o
programa diz qual é a melhor opção de desconto.*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe a quantidade de livro que deseja comprar: ");
        int x = s.nextInt();

        double criA = 0.0, criB = 0.0;

        criA = (float) (0.25 * x) + 7.50;
        criB = (float) (0.50 * x) + 2.50;
        if (criA < criB) {
            System.out.println("melhor promocao e o criterio A: " + criA + "\npromocao B: " + criB);
        }
        if (criB < criA) {
            System.out.println("melhor promocao e o criterio B: " + criB + "\npromocao A: " + criA);
        } if(criA == criB){
            System.out.println("tanto faz\npromocao A " + criA + "\npromocao B " + criB);
        }
    }

}
