import java.util.Scanner;

public class CalcSum{
	/*
	This app will calculate the sum 
	of two int variables, that user will insert. 
	*/
	public static void main(String[] args){
		System.out.println("\nIn Order to calculete the sum please insert a numbert");
		Scanner scaner = new Scanner(System.in);
		int firstNumber = scaner.nextInt();
		System.out.println("\nPlese insert the second number");
		int secondNumber = scaner.nextInt();
		int sumNumber = firstNumber + secondNumber;
		System.out.println("\nThe answer is: " + sumNumber);
		System.out.println("\nSum Calculator");
		System.out.println("Author: Constantin Darea");
		System.out.println("This short app calculate the sum of two integer number.");	
		
	}
}