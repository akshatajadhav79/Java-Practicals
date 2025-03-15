
import java.util.Scanner;

//  import java.util.*;
// abstract class Staff{
//     protected int id;
//     protected String name;
//     Staff(int sid,String sname){
//         this.id = sid;
//         this.name = sname;
//     }
// }
// class OfficeStaff extends Staff{
//     String department;
//     OfficeStaff(int id ,String name){
//         super(id ,name);
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENter dep:");
//         department = sc.nextLine();
//     }
//     public static void main(String args[]){
//         OfficeStaff os = new OfficeStaff(12,"AJ");
//         os.dispInfo();
//     }
//     public void dispInfo(){
//         System.out.println("Staff Name is "+name+ " Staff id is " +id+ " And department is "+department);
//     }
// }
//2. Create class Student with method SetDetails (int rollNo, string Name) using Anonymous class.
// interface myface{
//     void display();
// }
// class Student  {
//     void SetDetails(int rollNo, String Name) {
//         myface oj1 = new myface() {
//             @Override public void display()
//             {
//                 System.out.print("Name is " + Name+" And roll Number is "+rollNo);
//             }
//         };
//         oj1.display();
//     }
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.SetDetails(101, "John Doe");
//     }
// }
// 3.Count
// class Country {
//     String place = "Earth";
//     void mycountry(){
//         System.out.println("Country is India");
//     }
// }
// class Continent extends Country{
//     void display(){
//         System.out.println("Continent is Esia");
//     }
// }
// class State  extends Country{
//     void display(){
//         System.out.println("State is Maharashtra on "+place);
//     } 
//     public static void main(String[] args) {
//         State s= new State();
//         Continent c = new Continent();
//         c.display();
//         s.display();
//         s.mycountry();
//     }
// }
// 4Write a program to using marker interface create a class Product (product_id, product_name, product_cost, product_quantity) default and parameterized constructor. Create objectsof class product and display the contents of each object and Also display the object count.
// interface  myface{}
// class Product{
//     int product_id;
//     int product_quantity;
//     String product_name;
//     float product_cost;
//     static int count = 0;
//     public Product() {
//         System.out.println("I am default Constructor");
//         count = count+1;
//     }
//     public Product(int product_id,String product_name,float product_cost,int product_quantity){
//         this.product_quantity = product_quantity;
//         this.product_cost = product_cost;
//         this.product_id = product_id;
//         this.product_name = product_name;
//         count = count+1;
//     }
//     void show(){ 
//         System.out.println("I am parameterized Constructor");
//         System.out.println("Product Id:"+product_id);
//         System.out.println("Product Name:"+product_name);
//         System.out.println("Product cost:"+product_cost);
//         System.out.println("Product Quality:"+product_quantity+"kg");
//     }
//     static void counter(){
//         System.out.println("Count:"+count);
//     }
//     public static void main(String[] args) {
//         Product p = new Product();
//         Product p2 = new Product(101,"rice", 150,1);
//         p2.show();
//         p2.counter();
//     }
// }

class Student {

    public Boolean checkprime(int num) {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) { // Optimized check till sqrt(num)
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Number:");
            int num = sc.nextInt();
            if (num == 0) {
                Student s = new Student();
                if (s.checkprime(num)) {
                    System.out.println("Number is Prime Number");
                } else {
                    System.out.println("Number is not prime Number");
                }

            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            sc.close(); // Closing the scanner to prevent resource leak
        }
    }
}

