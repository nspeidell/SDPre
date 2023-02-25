import java.util.Scanner;

public class Objective9Lab3 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int selection = 0;

		while(selection <= 2) {
				printMenu();
				selection = scanner.nextInt(); 

		if(selection == 1) {
			System.out.println("Hello world!");
		}

		else if(selection == 2) {
			System.out.println("Apples, Bananas, Coconut");
		}
        else {
        }

		}
		scanner.close();
		System.out.println("Goodbye");
		}
	public static void printMenu() {
		System.out.println("_____Menu_____");
		System.out.println("1: Say Hello");
		System.out.println("2: List my favorite foods");
		System.out.println("3: Goodbye");
		System.out.println();

	}
	}