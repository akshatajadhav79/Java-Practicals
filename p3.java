
// 5. Write a program that uses an anonymous class to create a thread by implementing the Runnable interface.
interface Runnable{
    public void fun();
}

// 6. Create an abstract class Animal with an abstract method makeSound(). Use an anonymous class to instantiate an object of Animal and override the makeSound() method.
abstract class Animal{
    abstract void makeSound();
}

// 11. Write a program to demonstrate method overloading and method overriding using a Calculator class.
class Calculator{
    int add(int a,int b){
        return a+b;
    }
} 
class Calculator_sec extends Calculator{
    // overloading
    int add(int a,int b,int c){
        return a+b+c;
    }
    // Overridding
    int add(int a,int b){
        System.out.println("Addition =" +(a+b));
        return a+b;
    }
    
}

// 12. Create a base class Shape with a method draw(). Override the draw() method in subclasses Circle and Rectangle. Write a program to show runtime polymorphism using a reference of the Shape type.
class Shape{
    void draw(){
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Shape Circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("SHape rectangle");
    }
}

class p3{
    public static void main(String [] args){
        System.out.println("hi");
        // 5.
        Runnable r = new Runnable(){
            public void fun(){
                System.out.println("my Ananoumas class");
            }
        };
        r.fun();

        // 5.
        Animal a = new Animal(){
            void makeSound(){
                System.out.println("Dog barkes");
            }
        };a.makeSound();

        // 11.
        Calculator_sec cs = new Calculator_sec();
        int res = cs.add(23,4,5);
        System.out.println(res);
        System.out.println(cs.add(2,3));

        // 12.
        Shape s;
        s =  new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
    }
}