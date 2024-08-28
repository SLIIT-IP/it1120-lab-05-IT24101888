import java.util.Scanner;

public class IT24101888Lab5Q1 {
	public static void main(String[] args) {
		int a, b, c, max, small;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer:");
		a = input.nextInt();
		System.out.print("Enter the second integer:");
		b = input.nextInt();
		System.out.print("Enter the third integer:");
		c = input.nextInt();
		if(a<b&&a<c){
			small=a;}
		else if(b<a&&b<c){
			small=b;}
		else{
			small=c;}
        	if (a > b && a > c) {
           	 max = a;
        	} else if (b > a && b > c) {
            	max = b;
        	} else {
            	max = c;
        	}
	System.out.println();
        System.out.println("user entered number are:"+a+" "+b+" "+c);
        System.out.println("The smallest number is: " + small);
        System.out.println("The largest number is: " + max);				
	}
}