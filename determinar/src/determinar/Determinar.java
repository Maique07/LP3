/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package determinar;

import javax.swing.JOptionPane;

/**
 *
 * @author Maique
 */
public class Determinar {

    /**
     * @param i
     * @return
     */
    public static long determinar(long i) {
        int x = 0;
        if (i == 0) {
            return 1;
        } else {
            while (i != 0) {
                x++;
                i /= 10;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        long x = -1;
        long result= 0;
        while (x < 0) {
            String a = JOptionPane.showInputDialog("informe um numero: ");
            x = Long.parseLong(a);
            result = determinar(x);
        }
        JOptionPane.showMessageDialog(null, "o numero de digitos é: "+result);
    }

}
