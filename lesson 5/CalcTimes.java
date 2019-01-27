import java.util.Scanner;

public class CalcTimes{
	/*
	This app will calculate the multiplication 
	of two int variables, that user will insert. 
	*/
	public static void main(String[] args){
		System.out.println("\nIn Order to calculete the multiplication please insert a numbert");
		Scanner scaner = new Scanner(System.in);
		int firstNumber = scaner.nextInt();
		System.out.println("\nPlese insert the second number");
		int secondNumber = scaner.nextInt();
		int rezultNumber = firstNumber * secondNumber;
		System.out.println("\nThe answer is: " + rezultNumber);
		System.out.println("\nMultiplication Calculator");
		System.out.println("Author: Constantin Darea");
		System.out.println("This application calculate the multiplication of two integer number.");
	}
}