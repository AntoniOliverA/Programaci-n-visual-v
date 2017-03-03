/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import static Ejercicios.Salary.ex;
import java.util.Scanner;

/**
 *
 * @author STyDE AdC
 */
public class Sandwich {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Numero de condimentos");
        Integer condimentos = teclado.nextInt();

        System.out.println("Tipo de pan");
        Integer pan = teclado.nextInt();

        System.out.println("Numero de Sandwich");
        Integer numero = teclado.nextInt();

        Double suma = extras(condimentos, pan, numero);
        System.out.println("Tu cuenta es de" + suma);
      

    }

    public static Double extras(Integer A, Integer B, Integer C) {
        Double pago = (((4.99*A)+(4.99*B))*C);
        return pago;
    }
   
    
}
    

