import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter a number");
			int num = keyboard.nextInt();

if(num % 2 == 0) {
	System.out.println("The number is even");
}
else {
	System.out.println("The number is odd");
}
keyboard.close();
	}
}