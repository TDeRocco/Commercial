// Program: 3
// Author: Talon DeRocco
// Date: 9.30.19

import java.util.Scanner;


public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Start keyboard
		Scanner keyboard = new Scanner(System.in);
		
		
		// Declare variables
		int currentNumber;
		String name = ("Talon");
		int counter = 100;
		int loopCounter = 100;
		int secondLoopCounter = 0;
		
		
		// Declare User's name and number
		System.out.print("What is your name?");
		name = keyboard.next();
		System.out.print("Think of a number between 0-100");
		currentNumber = keyboard.nextInt();
		
		// Highlight Incrementers
		
		System.out.println("Counter = " + counter);
		counter = counter +1;
		System.out.println("Counter = " + counter);
		counter++;
		System.out.println("Couner = " + counter);
		++counter;
		System.out.println("Counter = " + counter);
		
		// While Loops
		while (loopCounter >0)
		{
			System.out.println("Loop Counter = " + loopCounter);
			loopCounter--;
			
		}
		
		do
		{ 
			System.out.println("Second Loop Counter = " + secondLoopCounter);
			secondLoopCounter++;
		}while (secondLoopCounter != 9);
		
		int number;
		
			for (int i = currentNumber; i <=100; i++)
			{
				if(i<100)
					System.out.println("Congratulations! Your number " + i + " is how many kids you have");
				else
					System.out.println("Wow! You're going to have " + i + " kids." );
					
			}
			
			if (currentNumber > 100)
			{
				System.out.println("Input Invalid. Enter new number");
			}
			else 
			{	
				System.out.println("Thank you for your input.");
			}
	}

}
