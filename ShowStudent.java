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

public class ShowStudent {
    public static class Student {
    private String ID;
    private Integer Cred;
    private Integer points;
     
     public String getId(){
        return ID; 
    }
     
    public void setIdnumber(String num){
        this.ID=num;
    }
     
     public Integer getCredhours(){
        return Cred; 
    }
     
    public void setCred(Integer cred){
        this.Cred=cred;
    }
     
     public Integer getPoints(){
        return points; 
    }
     
    public void setPoints(Integer punt){
        this.points=punt;
    }
     
   public Integer gradepoint(){
       return points/Cred;
   }
     
}
    public static void main(String[] args) {
        Student stud=new Student();
        stud.setIdnumber("0144");
        stud.setCred(50);
        stud.setPoints(10);
        stud.gradepoint();
         
        System.out.println("ID:"+stud.getId());
        System.out.println("Credit hours earned: "+stud.getCredhours());
        System.out.println("Points earned: "+stud.getPoints());
        System.out.println("The Grade Point Average is: "+stud.gradepoint());
    }
}
    

