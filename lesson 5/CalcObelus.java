import java.util.Scanner;

public class CalcObelus{
	/*
	This app will calculate the division 
	of two int variables, that user will insert. 
	*/
	public static void main(String[] args){
		System.out.println("\nDivision Calculator");
		System.out.println("Author: Constantin Darea");
		System.out.println("This application calculate the division of two integer number.");
		System.out.println("\nIn Order to calculete the division please insert a numbert");
		Scanner scaner = new Scanner(System.in);
		int firstNumber = scaner.nextInt();
		System.out.println("\nPlese insert the second number");
		int secondNumber = scaner.nextInt();
		double divisionNumber = (double) firstNumber / secondNumber;
		System.out.println("\nThe answer is: " + divisionNumber);
	}
}