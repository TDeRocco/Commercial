// Name:	Talon DeRocco
// Project:	Final
// Version:	1

import java.io.*;
import java.util.Scanner;


public class part3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("/Users/talonderocco/Desktop/VideoGamesIn.txt", true);
		PrintWriter outputFile = new PrintWriter(fw);
		
		File myFile = new File("/Users/talonderocco/Desktop/VideoGamesOut.txt");
		Scanner inputFile = new Scanner(myFile);
		
	while (inputFile.hasNext())
	{
		String gameName = inputFile.nextLine(); 
		System.out.println(gameName);
		
		outputFile.println(gameName);
	}
	
	outputFile.close();
	inputFile.close();
	}

}
