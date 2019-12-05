// Name:	Talon DeRocco
//Version:	6.0


import java.util.Scanner; 
import java.util.Random; 


public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Cursed Foods. Eat as many cursed or disturbing foods and win!");
		System.out.print("How many rounds do you wanna go ?");
		
		int rounds = keyboard.nextInt();
		int[][] scores = new int[2][rounds];
		Random randomNumber = new Random();
		
		int teamOneTotal= 0;
		int teamTwoTotal= 0;
		String teamOne = "";
		String teamTwo = "";
		
		
		for (int col = 0; col < scores[0].length; col++)
		{
			for (int row = 0; row < scores.length; row++)
			{ 
				scores[row][col] = randomNumber.nextInt(10);
				
				if(row==0)
				{
					teamOneTotal+= scores[row][col];
				}else
				{
					teamTwoTotal+= scores[row][col];
				}
					
			}
		}
		
		
		// compare
		if (teamOneTotal > teamTwoTotal)
		{ 
			System.out.println("Team One is the winner!");
		}
		else
		{
			System.out.println("Team Two is the winner!");
		}
	
		
		System.out.println(teamOne + teamOneTotal);
		System.out.println(teamTwo + teamTwoTotal);
		
		keyboard.close();
	}

}
