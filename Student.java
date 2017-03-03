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

public class Student {
    private String ID;
    private Integer Cred;
    private Integer points;
     
     public String getId(){
        return ID; 
    }
     
    public void setIdnumber(String num){
        this.ID=num;
    }
     
     public Integer getCred(){
        return Cred; 
    }
     
    public void setCredhours(Integer cred){
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

    
    


