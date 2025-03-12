package javaapplication38;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    /*Um aluno realizou três provas de uma disciplina. Considerando o critério abaixo, faça um
programa que mostre a média e se ele foi aprovado ou reprovado.
Média = (Prova1 + Prova2 + Prova3)/ 3
A média deve ser maior ou igual a 7,0. Se não conseguir, a nova média deve ser:
Final = (Média + Recuperação) / 2
Nesse caso, a média final deve ser maior ou igual a 5,0.*/
    public static void main(String[] args) {
        double x = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("informe a nota " + (i + 1));
            double soma = s.nextDouble();
            x += soma;
        }
        double media = x/3;
        if (media >= 7) {
            System.out.println("sua media foi: " + media);
            System.out.println("aluno aprovado");
        } else {
            System.out.println("sua media foi: " + media);
            System.out.println("aluno reprovado");
            
            System.out.println("informa a sua nota da recuperação");
            double rec = s.nextDouble();
            double nfinal = (rec + media)/2;
            if(nfinal >= 5){
                System.out.println("sua media foi: " + nfinal);
            System.out.println("aluno aprovado"); 
            }else{
                 System.out.println("sua media foi: " + nfinal);
            System.out.println("aluno reprovado");
            }
        }
    }

}
