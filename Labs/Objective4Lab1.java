import java.util.Scanner;
public class Objective4Lab1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is your first name?");
			String firstName = keyboard.nextLine();

		System.out.println("What is your last name?");
			String lastName = keyboard.nextLine();

		System.out.println("What is your favorite animal?");
			String favAnimal = keyboard.nextLine();

		System.out.println("What is your favorite food?");
			String favFood = keyboard.nextLine();

		System.out.println("What is your favorite song?");
			String favSong = keyboard.nextLine();

		System.out.println("What is your first name?");
			System.out.println(firstName);

		System.out.println("My name is " + firstName + " " + lastName);
		System.out.println("My favorite animal is " + favAnimal);
		System.out.println("My favorite food is " + favFood);
		System.out.println("My favorite song is " + favSong);

		keyboard.close();
	}
}