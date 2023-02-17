import java.util.Scanner;

public class Objective5Lab3 {
	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);

	System.out.println("Please enter number: ");
       int userNum = keyboard.nextInt();

     if(userNum > 0) {
     		System.out.println("The number is positive");
     }

     else if(userNum < 0) {
     		System.out.println("The number is negative");
     }
     else {
     	System.out.println("The number equals 0");
}

	keyboard.close();
	}
}