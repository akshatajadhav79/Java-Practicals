
import java.util.*;

public class MyArralist {

    public static void main(String[] args) {
        System.out.println("hi");
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Akshata");
        obj.add("Sahil");
        obj.add("rahul");
        obj.add("sneha");
        obj.add("raj");
        obj.add("ram");
        obj.add("Akshata");
        obj.add("sos");
        System.out.println("Before Rrmove=" + obj + " " + obj.size());

        // Using Iterator to avoid index shifting issues
        Iterator<String> iterator = obj.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (index % 2 == 0) {
                iterator.remove();
                System.out.println("Removed element at index = " + index);
            }
            index++;
        }
        System.out.println("After remove =" + obj);


        // palinderom
        System.out.println("Original List: " + obj);

        System.out.println("Palindromes in the list:");
        for (String string : obj) {
            System.out.println(isPalindrome(string));
        }

        // Verctor conversion
        Vector v = new Vector<>(obj);
        System.out.println("vector=="+v);


        }





        // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
