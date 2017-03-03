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
public class Salary {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Horas trabajadas");
        Integer Trabajado = teclado.nextInt();

        System.out.println("Pago por hora");
        Integer Pago = teclado.nextInt();

        System.out.println("Horas extras trabajadas");
        Integer Bono = teclado.nextInt();

        Double suma = extras(Pago, Trabajado, Bono);
        Double suma1= ex(Pago, Bono);
        System.out.println("Esta semana cobrarás en total: " + suma);
        System.out.println("Esta semana se sumo por las horas: " + suma1);

    }

    public static Double extras(Integer A, Integer B, Integer C) {
        Double pago = (B * A) + (C * (A * 1.5));
        return pago;
    }
     public static Double ex(Integer A,Integer C) {
        Double pago1 =(C * (A * 1.5));
        return pago1;
    }


}