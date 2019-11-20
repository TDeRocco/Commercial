// Author	Talon DeRocco
// Date		11.12.19
// Project	Program 8

// file usage
import java.io.*;
import java.util.Scanner;


public class Prog9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {

		FileWriter fw = new FileWriter("/Users/talonderocco/Desktop/gradesOut.txt", true);
		PrintWriter outputFile = new PrintWriter(fw);
		
		// Create a File
		File myFile = new File("/Users/talonderocco/Desktop/grades.txt");
		Scanner inputFile = new Scanner(myFile);
		
		// variables
		double totalPoints = 0.00;
		double totalGrades = 0.00;
		double totalAverage = 0.00;
		
		while (inputFile.hasNext())
		{
			char category = inputFile.next().charAt(0);
			double catAmount = inputFile.nextDouble();
			
			switch(category)
			{
			case 'A':
				totalPoints+=catAmount;
				break;
			case 'B':
				totalGrades+=catAmount;
				break;
			case 'C':
				totalAverage+=catAmount;
				break;
			}
		}
		
		outputFile.println("Total Number of Points Scored");
		outputFile.println("===================");
		outputFile.printf("Category A:\t$%.2f\n", totalPoints);
		outputFile.printf("Category B:\t$%.2f\n", totalGrades);
		outputFile.printf("Category C:\t$%.2f\n", totalAverage);
		
		// Close files
		outputFile.close();
		inputFile.close();
	}
catch (EOFException error)
{
			System.out.println("Error. Invalid Information.");
			System.out.println("Error Message: " + error.getMessage());
}
catch (FileNotFoundException error)
		{ 
			System.out.println("I cannot find that file.");
			System.out.println("Error Message: " + error.getMessage());
			
		}
		}
	
}