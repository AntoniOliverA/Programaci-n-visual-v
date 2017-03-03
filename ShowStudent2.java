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
public class ShowStudent2 {
    
   public static void main(String[] args) {
        Student stud=new Student();
        stud.setIdnumber("0144");
        stud.setCred(50);
        stud.setPoints(10);
        stud.gradepoint();
         
        System.out.println("ID: "+stud.getId());
        System.out.println("Credit hours earned: "+stud.getCred());
        System.out.println("Points earned: "+stud.getPoints());
        System.out.println("The Grade Point Average is: "+stud.gradepoint());
    }  
}
    

