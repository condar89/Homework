import java.util.Scanner;
public class InfiniteWhileModel{
	public static void main(String[] args){
		boolean isAppEnabled = true;
		while(isAppEnabled){
				System.out.println("- Please choose an option:");
 				System.out.println("1. Use the calc");
 				System.out.println("2. Quit");
 				Scanner reader = new Scanner(System.in);
 				int option = reader.nextInt();
			switch (option) {
				case 1:{
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
				}
				else if (operation == '-'){
				theAnswer = firstNumber - secondNumber;
				}
				else if (operation == '*'){
				theAnswer = firstNumber * secondNumber;
				}
				else if (operation == '%'){
				theAnswer = firstNumber % secondNumber;	
				}
				else if (operation == '/'){
				theAnswer = (double) firstNumber / secondNumber;
				}
				else { theAnswer = 707.7090709;
				}
				System.out.println("\nThe Answer is: " + theAnswer );
				}
				case 2:{
					isAppEnabled = false;
					}
				}

			}
	}
}

	
