
import java.util.*;

class InvalidDateException extends Exception {

    public InvalidDateException(String message) {
        super(message);
    }
}

class Date {

    private int day, month, year;

    public Date(int day, int month, int year) throws InvalidDateException {
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid Date:" + day + "/" + month + "/" + year);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }
        return day >= 1 && day <= daysInMonth[month];
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public void display() {
        System.out.println("Valid Date: " + day + "/" + month + "/" + year);
    }
}

class J3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter day: ");
            int day = sc.nextInt();
            System.out.print("Enter month: ");
            int month = sc.nextInt();
            System.out.print("Enter year: ");
            int year = sc.nextInt();
            Date date = new Date(day, month, year);
            date.display();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
