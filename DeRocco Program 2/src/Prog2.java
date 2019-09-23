// Project: Program 2
// Author: Talon DeRocco
// Date: 9.23.19
// Version: 1.0

// Import Required Code (import code for keyboard)
import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Declare Variables
			int age = 15;
			int correct = 16;
			int year = 20;
			
		// Declare variables
			int choice;
		
		// Display menu and get user input
			System.out.println("What is the driving age in the United States?");
			System.out.println("\t1.) 12");
			System.out.println("\t2.) 20");
			System.out.println("\t3.) 18");
			System.out.println("\t4.) 16");
			System.out.println("\t5.) Exit\n");
			
		System.out.print("Please make a choice (1-5): 4");
		choice = keyboard.nextInt();
		
		// Output content based upon user input
		switch (choice)
		
		{
		case 1:
			System.out.println("12");
			break;
		case 2: 
			System.out.println("20.");
			break;
		case 3:
			System.out.println("18");
			break;
		case 4:
			System.out.println("16");
		default:
			System.out.println("16.");
			
		// Close keyboard
			keyboard.close();
		}
		
		// Determine driving age.
		if (age < 16)
		{
			System.out.println("age is less than 16");
			
		}
		else // if age is greater than or equals 16
		{
			System.out.println("You can drive any time you want.");
		
		}
		 // 15+16=31
		{
			System.out.println("15 + 16 = 31");
		}
		 // 31 is greater than 20
			System.out.println("31 is greater than 20");
		}
	}