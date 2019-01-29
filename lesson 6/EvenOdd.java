import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args){
		System.out.println("Please insert your number.");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number % 2 == 0){
		System.out.println("Your number is Even");
		}else {
		System.out.println("Your number is Odd");
		}
	}
}