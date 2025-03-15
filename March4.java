
import java.lang.*;
import java.util.Scanner;

class CustmerException extends Exception {
    public CustmerException(String str2) {
        super(str2);
    }
}

// class customer {
//     customer(int cmno, String cname){
//         this.cmno = cmno;
//         this.cname = cname;
//     }
//     public void get(int cmno, String cname) throws CustmerException {
//         if (cmno == null) {
//             throw new CustmerException("Custmer detail incorrect exception.");
//         }
//     }
// }
    class March4  {

        public void get(Integer cmno, String cname) throws CustmerException {
            if (cname == null || cname.isEmpty()) {
                throw new CustmerException("Custmer detail incorrect exception:name is not be null");
            }
            if (cmno == null) {
                throw new CustmerException("Custmer detail incorrect exception:Mnumber is not be null");
            }
        }

        public static void main(String args[]) {

            March4 m = new March4();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name:");
            String cname = sc.nextLine();
            System.out.println("Enter Phone:");
            Integer cmno = null;

            if(sc.hasNext()){
                cmno = sc.nextInt();
            }else{
                sc.next();
            }
            System.out.println("Thank you");

            try {
                m.get(cmno, cname);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("Akshata");
                try {
                    int a[] = {1, 2, 3, 4};
                    System.out.println("Sneha" + a[4]);
                } catch (Exception e) {
                    System.out.println("Rahul Catch error:" + e);
                } finally {
                    System.out.println("Finally");
                }
            }

        }
    }
