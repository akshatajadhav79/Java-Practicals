
import java.util.*;

public class Myvector {
    public static void main(String[] args) {
        Vector<customer> cust = new Vector<>();
        cust.addElement(new customer(101,"AJ","goa"));
        cust.addElement(new customer(102,"SJ","pune"));
        cust.addElement(new customer(103,"DJ","muba"));
        cust.addElement(new customer(104,"OJ","kashmir"));
        System.out.println(cust);

        for (customer customer : cust) {
            System.out.println(customer);
        }
        for (customer customer : cust) {
            if (customer.cid == 101 ){
                System.out.println("customer is: "+customer);
            }
        }



        // Arraylist methods
        ArrayList<String> a =new ArrayList<>(20);
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Sahil");
        a1.add("Akshata");
        a1.add("ram");
        a1.add("raj");
        a1.add("swap");

        a.add("aj");
        a.add("oj");
        a.add("sj");
        a.clear();
        a.addAll(a1);
        a.clone();
        a.remove(1);
        
        System.out.println(a);
        System.out.println(a.clone());
        // give value of index
        System.out.println(a.get(2));
        System.out.println(a.indexOf("ram"));
        ListIterator<String> i = a.listIterator();
        while(i.hasNext()){
            System.out.println("MYLIST= "+i.next());
        }
        // sublist
        System.out.println(a.subList(3, 4));

        System.out.println(a.size());
        a.trimToSize();
        System.out.println(a.size());


        // vector
        Vector<Integer> v = new Vector<>(3,2);
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        // Insert an element at index 1
        v.insertElementAt(0, 1);

        // Remove the element at index 2
        v.removeElementAt(2);

        // Print the elements of the vector
        for (int vi : v) {
            System.out.println(vi);
        }
    }

}

class customer{
    int cid;
    String cname,cadd;
    customer(int cid,String cname,String cadd){
        this.cid = cid;
        this.cname = cname;
        this.cadd = cadd;
    }
    public String toString(){
        return "Customer[Id:"+cid+" Cname:"+cname+" Address:"+cadd+"]";
    }
}
