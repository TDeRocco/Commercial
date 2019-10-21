// Project:		Program 5
// Author:		Talon DeRocco
// Date:		10.21.19
// Version		1.0


// Import Required Code (import code for keyboard)
import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Declare Variables
		int choice;
		int number1;
		
		// Display menu and get user input
		System.out.println("Main Menu");
		System.out.println("=========\n");	
		System.out.println("\t1.) Hulk");
		System.out.println("\t2.) Captain America");
		System.out.println("\t3.) Black Widow");
		System.out.println("\t4.) Iron Man");
		System.out.println("\t5.) Hawkeye");
		System.out.println("Pick a number between (1-5): to determine your favorite superhero");
		choice = keyboard.nextInt();
		
		switch (choice)
		{
		case 1:
			System.out.println("Hulk");
			break;
		case 2:
			System.out.println("Captain America");
			break;
		case 3:
			System.out.println("Black Widow");
			break;
		case 4:
			System.out.println("Iron Man");
			break;
		case 5:
			System.out.println("Hawkeye");
			break;
		default:
			System.out.println("You didn't pick a number between 1-5. PICK AGAIN!");
		}
		
		// Close the keyboard
		keyboard.close();
		
		
		}

	}

