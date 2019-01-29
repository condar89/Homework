import java.util.Scanner;

public class Calc{
	public static void main(String[] args){
		System.out.println("\nPlease insert your first number");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		System.out.println("\nInsert the Operation +,-,*,/ or %");
		char operation = scanner.next(".").charAt(0);
		System.out.println("\nInsert your second number");
		int secondNumber = scanner.nextInt();
		scanner.close();
		double theAnswer;
		if (operation == '+'){ 
		theAnswer = firstNumber + secondNumber;
		System.out.println("\nThe Answer is:" + theAnswer);
		} 
		if (operation == '-'){
		theAnswer = firstNumber - secondNumber;
		System.out.println("\nThe Answer is:" + theAnswer);
		}
		if (operation == '/'){
		theAnswer = firstNumber / secondNumber;
		System.out.print("\nThe Answer is:" + theAnswer);
		}
		if (operation == '*'){
		theAnswer = firstNumber * secondNumber;
		System.out.print("\nThe Answer is:" + theAnswer);
		}
		if (operation == '%'){
		theAnswer = firstNumber % secondNumber;	
		System.out.print("\nThe Answer is:" + theAnswer );
		}
		
	}
}