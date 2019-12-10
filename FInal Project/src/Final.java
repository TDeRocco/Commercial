// Name:	Talon DeRocco
// Date:	12.10.19
// Version:	1.0

import java.util.Scanner;
import java.util.Random;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner (System.in);
		
		// Declare Variables
		int computerInt;
		
		String userPlay = "X"; 
		String computerPlay = "";
		String response;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random(); 
		
		System.out.println("Computer, should I buy this R rated game?");
		System.out.println("Let's play Rock, Paper, Scissors!\n" + "Please enter a move.\n" + "Rock = R, Paper" + "= P, and Scissors = S.");
		System.out.println("If you win, buy the game. If I win, don't");
		System.out.println("Let's go for 3 games. If you are till undecided, play again.");
		System.out.println(); 
		
		computerInt = generator.nextInt(3)+1;
		
		
		if (computerInt ==1)
			computerPlay = "R";
		else if (computerInt == 2)
			computerPlay = "P";
		else if (computerInt == 3)
			computerPlay = "S";
		
		System.out.println("What's your move, User?: ");
		userPlay = scan.next(); 
		
		System.out.println("Computer plays: " + computerPlay);
		
		
		if (userPlay.contentEquals(computerPlay))
			System.out.println("Tie!");
		else if (userPlay.equals("R"))
			if (computerPlay.contentEquals("S"))
				System.out.println("Rock beats scissors. User Wins!");
			else if (computerPlay.equals("P"))
				System.out.println("Paper covers rock. User Loses!");
			else if (userPlay.equals("P"))
				if (computerPlay.equals("S"))
					System.out.println("Scissors cut paper. User Loses!");
				else if (computerPlay.equals("R"))
					System.out.println("Paper eats rock. User Wins!");
				else if (userPlay.equals("S"))
					if (computerPlay.equals("P"))
						System.out.println("Scissor cuts paper. User Wins!");
					else if (computerPlay.equals("R"))
						System.out.println("Rock breaks scissors. User Loses!");
					else 
						System.out.println("Invalid user input.");
		
		keyboard.close();
		
		
	}
	
}

