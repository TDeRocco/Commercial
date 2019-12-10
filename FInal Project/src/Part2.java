// Name:	Talon DeRocco
// Project:	Final
// Version:	1.0



import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Start variables
				Scanner Keyboard = new Scanner(System.in);
				
				int[] prices = new int[5];
				
				// Populate the array
				prices[0] = 0; 
				prices[1] = 40;
				prices[2] = 60;
				prices[3] = 80;
				prices[4] = 110;
				
				// Contents of array
				for (int i=0; i<prices.length;i++)
				{
					System.out.println("Version " + i + " costs: " + prices[i] + " dollars.");
				}
				
				int account; 
				System.out.print("How much do you money is availabe in your account?");
				account = Keyboard.nextInt();
				
				for (int i = account; i <=110; i++)
				{
					if(i<110)
						System.out.println("If you only have " + i + " dollars in your account, buy a cheaper version, different game, or no game at all.");
					else
						System.out.println("If you have enough then buy the most expensive version!");
				}
				
				int age;
				System.out.println("How old are you? ");
				age = Keyboard.nextInt();
				
				for (int i = age; i <18; i++)
				{
					if(i<65)
						System.out.println("Get a parent to purchase it for you.");
					else
						System.out.println("Congrats! You can legally buy an R-rated Video Game.");
				}
				
				Keyboard.close(); 
	}

}
