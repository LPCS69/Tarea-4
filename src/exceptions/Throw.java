/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Throw {

    /**
     * @param args the command line arguments
     */
    public static int dividendo;
    public static int divisor;

    public static void dividir() {
        try {
            if (divisor == 0) {
                throw new IllegalArgumentException("No se puede dividir por cero");
            }
            System.out.println(dividendo / divisor);
        } catch (IllegalArgumentException e) {
            System.err.print(e);
             System.out.println();
        }
    }
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Ingrese el Dividendo");
                Scanner leer = new Scanner(System.in);
                String opc = leer.nextLine();
                Throw.dividendo = Integer.parseInt(opc);
                System.out.println("Ingrese el Divisor");
                Scanner leer2 = new Scanner(System.in);
                String opc2 = leer2.nextLine();
                Throw.divisor = Integer.parseInt(opc2);
                dividir();
           
            } catch (NumberFormatException ex) {
                System.out.println("Se han introducido caracteres no númericos");
            }
        }
    }
}
