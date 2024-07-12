/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zeinabexam2;

/**
 *
 * @author LENOVO
 */
public class Student {
   private String name;
    private int id;
    
    public Student(){
        //name = null;
        //id=0;
    }
    public Student(String n){
        name = n;
    }
    public Student(int i){
        id=i;
    }
    public Student(String n, int i){
        name=n;
        id=i;
    }
    public Student(int i, String n){
        name=n;
        id=i;
    }
    public void setName(String n){
        name=n;
    }
    public void setID(int i){
        id=i;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
}  
}
