/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nadador;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class Nadador {

    /**
     * @param idade
     * @param args the command line arguments
     */
    public static void categoria(int idade) {
        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria infantil A");
        }
        if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria infantil B");
        }
        if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria juvenil A");
        }
        if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria juvenil B");
        }
        if (idade >= 18 && idade <= 100) {
            System.out.println("Categoria Adulto");
        }
    }

    public static void main(String[] args) {
        int x = -1;
        Scanner s = new Scanner(System.in);

        while (x < 5) {
            System.out.println("informe sua idade: \ndigite -1 para finalizar");
            x = s.nextInt();
            categoria(x);
        }
    }

}
