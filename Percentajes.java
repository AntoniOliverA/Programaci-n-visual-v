/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author STyDE AdC
 */
public class Percentajes {
    
    public static void main(String[] args){
        double A1 = 2.0;
        double A2 = 5.0;
        computePercent(A1, A2);
        computePercent(A2, A1);
    } 
    public static double computePercent(double A1, double A2){
        double porcent = (A2 * 100)/A1;
        System.out.println( "El porcentaje es de " + A1);
        System.out.println( "El porcentaje es de "  + A2);
        return porcent;
    }
  }
 

