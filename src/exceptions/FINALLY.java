/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Estudiante
 *Por defecto se crea un error en este código, que es intentar convertir en entero un String que contiene
 * el caracter "M", como no se puede hacer se captura el error y luego se ejecuta el fynally, 
 * para demostrar que con este tipo de excepciónes el error no impide esta última ejecución
 */
public class FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {

            System.out.println("Intentamos ejecutar el bloque de instrucciones:");
            System.out.println();
            
            System.out.println("Instrucción 1.");
            System.out.println();
            
            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecución.
            System.out.println();

            System.out.println("Instrucción 2.");
            System.out.println();

            System.out.println("Instrucción 3.");

        }

        catch (Exception e) {

            System.out.println("Se produjo uun ERROR");
            System.out.println();

        }

        finally {

            System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores como si no.");

        }

    }
    }
    

