import java.io.*;
public class Student implements Serializable{
    int age;
    String name;
    boolean isMale;
    Student(int age, String name, boolean isMale){
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }
    public void display(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
        System.out.println("isMale: "+isMale);
    }
    
}