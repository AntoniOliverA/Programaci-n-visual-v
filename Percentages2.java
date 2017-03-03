/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author STyDE AdC
 */
public class Percentages2 {
   public static void main(String [] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Eleger un numero");
       double A = teclado.nextDouble();
       
       System.out.println("Eleger un segundo numero");
       double B = teclado.nextDouble();
       computePercent(A, B);
       computePercent(A, B);
   }
   public static double computePercent(double A, double B) {
       double porcent = (B * 100)/A;
       System.out.println("Es el porcentaje");
       System.out.println(B);
       System.out.println("Es el porcentaje");
       System.out.println(A);
       return porcent;
   }
}
