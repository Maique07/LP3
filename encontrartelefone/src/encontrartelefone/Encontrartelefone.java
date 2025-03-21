/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encontrartelefone;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class Encontrartelefone {

    /**
     * @param args the command line arguments Faça um programa de consulta de
     * telefones a partir de um nome informado por uma chave de dados: leia
     * nomes de pessoas com seus respectivos telefones, sendo a quantidade
     * determinada pelo usuário. Em seguida pergunte ao usuário qual o nome que
     * ele deseja consultar o telefone. Após sua resposta, exiba o telefone da
     * pessoa procurada. Informe também se o nome é inexistente no banco de
     * dados.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe a quantidade de pesssoas: ");
        int x = s.nextInt();
        String nome[] = new String[x], telefone[] = new String[x];
        for (int i = 0; i < x; i++) {
            System.out.println("informe seu nome: ");
            nome[i] = s.next();
            System.out.println("Informe seu telefone: ");
            telefone[i] = s.next();
        }
        System.out.println("informe o nome que deseja encontrar");
        String y = s.next();
        int i;
        for (i = 0; i < x; i++) {
            if (nome[i].equals(y)) {
                System.out.println("Telefone encontrado!");
                System.out.println("Nome: " + nome[i]);
                System.out.println("Telefone: " + telefone[i]);
                break;
            }
        }
        if (i == x) {
            System.out.println("nome inexistente no banco de dados!");
        }
    }

}
