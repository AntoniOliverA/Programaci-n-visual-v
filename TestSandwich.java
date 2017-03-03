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
public class TestSandwich {
    
    public static String A(){
        Scanner teclado=new Scanner(System.in);
        String ingredient;
        System.out.println("Lista de condimentos elige tu opcion y escribe tu eleccion:\n Pollo\n Jamon\n Queso\n Carne");
        ingredient=teclado.nextLine();
        return ingredient;
    }
     
    public static String B(){
        Scanner teclado=new Scanner(System.in);
        String bread;
        System.out.println("Elige cual es el tipo de pan de tu agrado y escribe tu eleccion:\n coburg\n stottie\n baguette\n ciabatta");
        bread=teclado.nextLine();
        return bread;
    }
     
    public static Double Ticket(String i, String b){
        Double pan1=0.0;
        Double condimento1=0.0;
        Double total=0.0;
         
        switch(i){
            case "pollo":
                condimento1=3.0;
                break;
            case "jamon":
                condimento1=1.8;
                break;
            case "queso":
                condimento1=2.5;
                break;
            case "carne":
                condimento1=4.2;
                break;
        }
         
        switch (b){
            case "coburg":
                pan1=5.9;
                break;
            case "stottie":
                pan1=3.2;
                break;
            case "baguette":
                pan1=2.0;
               break;
            case "ciabatta":
                pan1=8.5;
                break;
        }
         
        total= pan1+condimento1;
         
        return total;
    }
         public static void main(String[]args){
        String condimento;
        String pan;
        Double price=0.0;
        condimento= A();
        pan=B();
        price=Ticket(condimento, pan);
        System.out.println(+price);
         
    }
     
}
  