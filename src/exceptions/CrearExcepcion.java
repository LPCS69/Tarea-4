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
public class CrearExcepcion {

    /**
     * @param args the command line arguments
     */
    public static class ExcepcionPropia extends Exception {

        public ExcepcionPropia(String msg) {
            super(msg);
        }

    }

    static void prueba(String str) throws ExcepcionPropia {
        if (str.equals("1")) {
            throw new ExcepcionPropia("El 1 arroja la excepción");
        }
    }

    public static void main(String[] args) throws ExcepcionPropia {
        // TODO code application logic here
        while (true) {
            //Entrada de datos
            System.out.println("Si ingresa un 1 hara una excepción");
            Scanner leer = new Scanner(System.in);
            //Depurar la expresion algebraica
            String opc = leer.nextLine();
            try {
                prueba(opc);
                System.out.println("Expresión Valida");
                System.out.println();
            } catch (ExcepcionPropia ex) {
                System.out.println("Se Ingreso un 1 y se arrojo la excpeción");
                System.err.println(ex);
                System.out.println();
            }

        }
    }
}
