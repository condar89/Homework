import java.util.Scanner;

public class CalcMinus{
	/*
	This app will calculate the substraction 
	of two int variables, that user will insert. 
	*/
	public static void main(String[] args){
		System.out.println("\nIn Order to calculete the substraction please insert a numbert");
		Scanner scaner = new Scanner(System.in);
		int firstNumber = scaner.nextInt();
		System.out.println("\nPlese insert the second number");
		int secondNumber = scaner.nextInt();
		int minNumber = firstNumber - secondNumber;
		System.out.println("\nThe answer is: " + minNumber);
		System.out.println("\nMinus Calculator");
		System.out.println("Author: Constantin Darea");
		System.out.println("This application calculate the substaction of two integer number.");
	}
}	