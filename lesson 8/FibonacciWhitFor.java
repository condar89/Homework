import java.util.Scanner;

public class FibonacciWhitFor{
	public static void main(String[] args){
		System.out.println("Insert your number!");
		Scanner scaner = new Scanner(System.in);
		int num = scaner.nextInt();
		int a = 0, b = 0, c = 1;
                System.out.println("\nFibonacci list till the number nr: " + num );
		for (int iteration = 0; iteration <= num; iteration++){
		a = b;
		b = c;
		c = a + b;
 		System.out.print(a + " ");
		}
	}
}