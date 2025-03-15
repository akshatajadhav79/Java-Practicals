// // Write a Java program to create a class Product with attributes id, name, and price. Create multiple objects of this class and display their details.
// // BufferReader Class TO get input String

// import java.io.*;
// import java.util.*;
// class Car
// {
//     Car(int id, String name,double price){
//         System.out.println("ID is: "+id);
//         System.out.println("Name is: "+name);
//         System.out.println("Price is: "+price);
//     }
    
//     public static void main(String args[])throws Exception{
//         System.out.println("Akshata Jadhav");
//         InputStreamReader r = new InputStreamReader(System.in);
//         BufferedReader br = new BufferedReader(r);
//         System.out.println("Enter Your Name: ");
//         String a = br.readLine();
//         System.out.println("Name is: "+a);

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Name product: ");
//         String name = sc.nextLine();
//         System.out.println("Enter Your ID: ");
//         int id = sc.nextInt();
//         System.out.println("Enter Your Price: ");
//         double price = sc.nextDouble();

//         Car c = new Car(id,name,price);
//         Car C1 = new Car(id,name,price);
//         Car C2 = new Car(id,name,price);
//     }
// }


// Encapsulation

class Rolls{

    private String name;

    // Getter Method
    public String getName(){
        return name;
    }

    // Setter Method
    public void setName(String newName){
        this.name = newName;
    }
}

class Car{
    
    public static void main(String args[]){
        Rolls r = new Rolls();
        r.setName("sahil");
        System.out.println(r.getName());
    }
}