package ordeminversa;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class OrdemInversa {

    /**
     * @param args the command line arguments Leia um conjunto de 10 valores
     * inteiros em um vetor e, em seguida, exiba-os na ordem inversa do que
     * foram digitados.
     */
    public static void main(String[] args) {
        int x[] = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("informe 10 numeros");
        for (int i = 0; i < 10; i++) {
            x[i] = s.nextInt();
        }
        System.out.println("ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(x[i]);
        }
    }

}
