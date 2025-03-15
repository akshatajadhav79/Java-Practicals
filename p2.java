import java.util.*;
import java.io.*;


// 4. Write a program where a class implements multiple interfaces, for example, Printable and Showable. Explain how Java handles multiple inheritance using interfaces.
interface Printable {
    void print();
}
interface Showable {
    void show();
}
class AddBoth implements Printable,Showable {
    public void print() {
        System.out.println("Printable");
    }
    public void show() {
        System.out.println("SHowable");
    }
}

// 3. How is an interface different from an abstract class? Write a program to illustrate the differences.
abstract class lotus{
    abstract void fun();
    // public void fun_1();
}
class flower extends lotus{
    void fun(){
        System.out.print("Abstract Method");
    }
    public void fun_1(){
        System.out.println("Non-Abstract Method");
    }
}


public class p2{
   
    public static void main(String args[]){
        System.out.println("hi");

        AddBoth  p = new AddBoth();
        p.print();
        p.show();

        // Abstract class
        flower f = new flower();
        f.fun();
        f.fun_1();

        // 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and salary = ");
        String n = sc.nextLine();
        System.out.println("Enter salary=");
        float sal = sc.nextFloat();
        //  When using sc.nextFloat(), it does not consume the newline character (\n) left in the input buffer. 
        sc.nextLine();  

        System.out.println("Enter Dept=");
        String dep = sc.nextLine();
        Manager m = new Manager(n,sal,dep);
        m.disp();
    }
}



// 8. Create a class Employee with attributes like name and salary, and a subclass Manager with an additional attribute department. Write a program to demonstrate inheritance.
class Employee{
    String name;
    float salary;
    Employee(String name, float salary){
        this.name = name;
        this.salary = salary;
    }
    void disp(){
        System.out.println(name+ " NAME  ");
    }
}
class Manager extends Employee{
    String Dept;
    Manager(String na,float sa,String Dept){
        super(na,sa);
        this.Dept = Dept;
    }
    void disp(){
        System.out.println("Name = "+name+ "And salay is "+salary+ "Dept= "+Dept);
    }
}