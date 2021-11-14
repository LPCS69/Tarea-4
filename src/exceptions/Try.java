/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Estudiante
 */
public class Try {
    public static void main(String[] args) {
        // TODO code application logic here
        Stack <Integer> pila = new Stack<Integer>();
        while (true) {
            System.out.println("Ingrese un número o se ejecutara una excepción");
            Scanner leer = new Scanner(System.in);
            String opc = leer.nextLine();
            try{
                pila.push(Integer.parseInt(opc));
                System.out.println();
                System.out.println("Así queda la pila con el nuevo elemento");
                System.out.println(pila);
                System.out.println();
            }
            catch (NumberFormatException ex){
                System.out.println("Solo se pueden agregar números");
           }   
        }
    }
}
