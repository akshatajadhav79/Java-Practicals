// import java.util.Scanner;

// class ZeroNumberException extends Exception {
//     public ZeroNumberException(String message) {
//         super(message);
//     }
// }

// class J3 {
//     public static boolean isPrime(int number) {
//         if (number < 2) {
//             return false; // 0 and 1 are not prime numbers
//         }
//         for (int i = 2; i <= Math.sqrt(number); i++) {
//             if (number % i == 0) {
//                 return false; // Found a divisor, not prime
//             }
//         }
//         return true; // No divisors found, it's prime
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         try {
//             System.out.print("Enter the number: ");
//             int n = sc.nextInt();
//             if (n >= 0) {
//                 throw new ZeroNumberException("Number is not positive");
//             } else {
//                 if (isPrime(n)) {
//                     System.out.println(n + " is a Prime Number");
//                 } else {
//                     System.out.println(n + " is not a Prime Number");
//                 }
//             }
//         } catch (ZeroNumberException e) {
//             System.out.println("Error: " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("Invalid input! Please enter an integer.");
//         } finally {
//             sc.close(); // Closing the scanner to prevent resource leak
//         }
//     }
// }

import java.util.ArrayList;
import java.util.Iterator;
class J3{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(12);
        a.add(13);
        a.add(14);
        a.add(15);
        a.add(16);
        a.add(17);

        System.out.println("Array="+a);

        Iterator<Integer> i = a.iterator();
        while (i.hasPrevious()){
                System.out.println("Element is="+i.Previous());

        }
    }
}
