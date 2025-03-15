// 1. Define an interface named Shape with methods area() and perimeter(). Implement this interface in two classes: Circle and Rectangle. Write a program to demonstrate their functionality.
import java.util.*;
import java.io.*;
interface Shape{
    public abstract void area();
    public abstract void perimeter();
}
class Circle implements Shape{
    int r;
    Circle(int r){
        this.r = r;
    }
    public void area(){
        System.out.println("Area of Circle ="+(3.14*r*r*2));
    }
    public void perimeter(){
        System.out.println("Area of Circle ="+(2*3.14*r));
    }
}
class Rectangle implements Shape{
    int l,b;
    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    public void area(){
        System.out.println("Area of Rectangle ="+(l*b));
    }
    public void perimeter(){
        float area = l*b;
        System.out.println("Area of Rectangle ="+ area);
    }
}


// 2. Create an interface Vehicle with a method start(). Implement this interface in classes Car and Bike, each providing their version of start().
interface Vehicle{
    public void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("I am in Car class");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("I am in Bike class");
    }
}
class practical1{
    public static void main(String args[]){
        System.out.println("hi");

        // 2
        Car c =new Car();
        c.start();
        Bike b = new Bike();
        b.start();

        // 1
        // InputStreamReader i = new InputStreamReader(System.in);
        // BufferedReader b = new BufferedReader(i);
        Circle ci = new Circle(2);
        ci.area();
        ci.perimeter();
        Rectangle r = new Rectangle(2,4);
        r.area();
        r.perimeter();

    }
}