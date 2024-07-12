/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zeinabexam2;

/**
 *
 * @author LENOVO
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Student s1 = new Student();//name=null, id=0
        System.out.println("Name: "+s1.getName()+" ID: "+s1.getID());
        System.out.println(s1);

        Student s2 = new Student("Ahmad");//id=0
        System.out.println("Name: "+s2.getName()+" ID: "+s2.getID());
        System.out.println(s2);
        
        Student s3 = new Student(123);//name=null
        System.out.println("Name: "+s3.getName()+" ID: "+s3.getID());
        System.out.println(s3);
        
        Student s4 = new Student("Ali", 234);
        System.out.println("Name: "+s4.getName()+" ID: "+s4.getID());
        System.out.println(s4);
        
        Student s5 = new Student(345, "Mohamad");
        System.out.println("Name: "+s5.getName()+" ID: "+s5.getID());
        System.out.println(s5);
        
        
        
        
    }
    
}
    
    

