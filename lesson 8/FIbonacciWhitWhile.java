import java.util.Scanner;

public class FibonacciWhitWhile{
	public static void main(String[] args){
		System.out.println("Insert your number!");
		Scanner scaner = new Scanner(System.in);
		int num = scaner.nextInt();
		int iteration = 0, a = 0, b = 0, c = 1;
                System.out.println("\nFibonacci list till the number nr: " + num );
		while (iteration <= num){
		a = b;
		b = c;
		c = a + b;
 		System.out.print(a + " ");
		iteration++;
		}
	}
}