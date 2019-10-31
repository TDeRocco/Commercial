// Author:	Talon DeRocco
// Project:	Bank Account

import java.util.Scanner;


public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	Declare variables
		double balance = 1000;
		int menuChoice = 0; 
		double depositAmount = 2000;
		double withdrawalAmount = 0.00;
		
		// Keyboard Scanner
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
				mainMenu();
				menuChoice = keyboard.nextInt();
				
				switch (menuChoice)
				{
				case 1:
						System.out.println("How much do you want to deposit? ");
						depositAmount = keyboard.nextDouble();
						balance = deposit(depositAmount, balance);
						break;
				case 2: 
						System.out.println("How much do you want to withdrawal? ");
						withdrawalAmount = keyboard.nextDouble();
						balance = withdrawal(withdrawalAmount, balance);
						break;
				case 3:
						displayBalance(balance);
						break;
				case 4:
						System.out.println("Thank you for your patronage.");
						break;
				default:
					System.out.println("Enter a valid command.");
				}
		}while (menuChoice != 4);
		
		// Close keyboard
		keyboard.close();
			
	}

	// Display menu
	

	private static void mainMenu() 
	{
		// TODO Auto-generated method stub
		System.out.println("Main Menu");
		System.out.println("1.) Make Deposit");
		System.out.println("2.) Withdrawal");
		System.out.println("3.) Check Balance");
		System.out.println("4.) Cancel Transaction");
		System.out.println("What transaction do you want to perform? ");
	}

	// Deposit
	public static double deposit(double amount, double balance)
	{
			return (amount+balance);
	}
	
	// Withdrawal
	public static double withdrawal(double amount, double balance)
	{
			return (balance-amount);
	}
	
	// Balance
	public static void displayBalance(double balance)
	{
			System.out.println("Your balance is: " + balance);
	}

}
