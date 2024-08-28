import java.util.Scanner;

public class IT24101888Lab5Q3 {
    public static void main(String[] args) {

     double CHARGE = 48000.00;
     double dis_3_4days = 0.10;
     double dis_5_more_days = 0.20;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int Reserved = endDate - startDate;
        double totalAmount = Reserved * CHARGE;

        double discountRate = 0.0;
        if (Reserved > 2 && Reserved <= 4) {
            discountRate = dis_3_4days;
        } else if (Reserved >= 5) {
            discountRate = dis_5_more_days;
        }

        double discountAmount = totalAmount * discountRate;
        double finalAmount = totalAmount - discountAmount;

        System.out.println();
        System.out.println("Room charge per Day:Rs. 48000.0/=");
        System.out.println("Number of days reserved: " + Reserved);
        System.out.println("Total amount to be paid: Rs " + finalAmount);
    }
}
