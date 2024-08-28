import java.util.Scanner;

public class IT24101888Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int a;
        System.out.print("Enter the number of new members introduced: ");
        a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Input must be a number 0 or greater");
        } else {
            switch (a) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("Prize: Pen");
                    break;
                case 2:
                    System.out.println("Prize: Umbrella");
                    break;
                case 3:
                    System.out.println("Prize: Bag");
                    break;
                case 4:
                    System.out.println("Prize: Travelling Chair");
                    break;
                default:
                    System.out.println("Prize: Headphone");
                    break;
            }
        }
    }
}
