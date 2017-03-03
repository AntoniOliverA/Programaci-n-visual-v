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

public class TestBankAccount {
      public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     System.out.println("Ingrese su nombre");
     String nombre=teclado.next();
     System.out.println("Ingrese su numero de cuenta");
     int numcue=teclado.nextInt();
     System.out.println("Ingrese su saldo ultimo");
     double saldo=teclado.nextDouble();
     System.out.println("Ingrese su nombre");
     String nombre1=teclado.next();
     System.out.println("Ingrese su numero de cuenta");
     int numcue1=teclado.nextInt();
     System.out.println("Ingrese su saldo ultimo");
     double saldo1=teclado.nextDouble();
     System.out.println("Ingrese su nombre");
     String nombre2=teclado.next();
     System.out.println("Ingrese su numero de cuenta");
     int numcue2=teclado.nextInt();
     System.out.println("Ingrese su saldo ultimo");
     double saldo2=teclado.nextDouble();
     
     BankAccount  nueva=new BankAccount (nombre,numcue,saldo);
     BankAccount  nueva1=new BankAccount (nombre1,numcue1,saldo1);
     BankAccount  nueva2=new BankAccount (nombre2,numcue2,saldo2);
     
     System.out.println("Su saldo es:\n "+nueva.deductMonthlyFee(saldo) );
     nueva.explainAccountPolicy();
     System.out.println("Su saldo es:\n "+nueva1.deductMonthlyFee(saldo) );
     nueva1.explainAccountPolicy();
     System.out.println("Su saldo es:\n "+nueva2.deductMonthlyFee(saldo) );
     nueva2.explainAccountPolicy();
 }
}
    

