import java.util.Scanner;
import java.util.spi.CurrencyNameProvider;

// interface Online {
//     void setOnline(String name);
//     void getOnline();
// }

// interface DistEdu{
//     void setDistEdu(String data);
//     void getDist();
// }


// class College{
//     static collegeName;
//     static collegeAdd;
//     public void getDetails(){
//         System.out.println("Enter COllege Name");

//         Scanner sc=new Scanner(System.in);
//         collegeName=sc.nextLine();
//         System.out.println("Enter COllege Address");
//         collegeAdd=sc.nextLine();

//                System.out.println("College Name : "+collegeName);
//                System.out.println("COllege Address "+collegeAdd);

//     }
// }

// class Online extends College,implements Online{
//     String name;
//     public void setOnline(String name){
//         this.name=name;
//     }
//     public void getOnline(){
//         System.out.println(name);
//     }
// }

// class DistEdu extends College, implements DistEdu{
//     String data;
//     void setDistEdu(String data){
//         this.data=data;
//     }
//     void getDist(){
//         System.out.println("Dist "+data);
//     }

// }

abstract class BankAccount{
    public abstract void deposit();
    abstract Void withdrawal();
    public float bal;
}

class SavingsAccount extends BankAccount{
    float amt;
    SavingsAccount(float amt){
        this.amt = amt;
    }
    public void deposit(){
        if(amt>0){
            bal = bal+amt;
            System.out.println("Total Balance: "+bal+" Deposit: "+amt);
        }
        else{
            System.out.println("Deposit amount must be positive");
        }
        
    }
    // void withdrawal(){
    //     if((amt>0 )&& (amt <= bal)){
    //         bal = bal-amt;
    //     System.out.println("Total Balance:"+bal+" and withdraw: "+amt);
    //     }
    //     else{
    //         System.out.println("Your amount is "+amt+ " But you have "+bal);
    //     }
        
    // }
}
class CurrentAccount extends BankAccount{
    public void deposit(float amt){
        if(amt>0){
            bal = bal+amt;
            System.out.println("Total Balance: "+bal+" Deposit: "+amt);
        }
        else{
            System.out.println("Deposit amount must be positive");
        }
    }
    // public void withdrawal(float amt){
    //     if((amt>0 )&& (amt <= bal)){
    //         bal = bal-amt;
    //     System.out.println("Total Balance:"+bal+" and withdraw: "+amt);
    //     }
    //     else{
    //         System.out.println("Your amount is "+amt+ " But you have "+bal);
    //     }
    // }
}



public class shashank {
    public float amt;
    
    public static void main(String[] args) {
        System.out.print("AJ");
        SavingsAccount s = new SavingsAccount(300);
        s.deposit();
        // s.withdrawal(20);
        // CurrentAccount c  = new CurrentAccount();
        // c.deposit(400);
        // c.withdrawal(10);
    }
}






// --------------------------------------------------------------------

class TicketBookingSystem { 
    private int availableSeats;

    public TicketBookingSystem(int totalSeats) {
        this.availableSeats = totalSeats;
    }

    public synchronized boolean bookTicket(String userName, int numberOfSeats) {
        System.out.println(userName + " trying to book " + numberOfSeats + " seat(s).");

        if (numberOfSeats <= availableSeats) {
            System.out.println("Seats available. Booking in progress for " + userName + "...");
            availableSeats -= numberOfSeats;
            System.out.println("Booking successful for " + userName + ". Seats left: " + availableSeats);
            return true;
        } else {
            System.out.println("Booking failed for " + userName + ". Not enough seats available.");
            return false;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}

class User extends Thread {
    private TicketBookingSystem system;
    private String userName;
    private int seatsToBook;

    public User(TicketBookingSystem system, String userName, int seatsToBook) {
        this.system = system;
        this.userName = userName;
        this.seatsToBook = seatsToBook;
    }

    @Override
    public void run() {
        system.bookTicket(userName, seatsToBook);
    }
}

public class OnlineTicketBookingSystem {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(10); // Total available seats

        // Simulate multiple users trying to book tickets
        User user1 = new User(bookingSystem, "Alice", 4);
        User user2 = new User(bookingSystem, "Bob", 3);
        User user3 = new User(bookingSystem, "Charlie", 5);
        User user4 = new User(bookingSystem, "Diana", 2);

        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}
