import java.util.Scanner;

public class FibonacciWhitDoWhile{
	public static void main(String[] args){
		System.out.println("Insert your number!");
		Scanner scaner = new Scanner(System.in);
		int num = scaner.nextInt();
		int iteration =0, a = 0, b = 0, c = 1;
                System.out.println("\nFibonacci list till the number nr: " + num );
		do {
			a = b;
			b = c;
			c = a + b;
			iteration++;
 			System.out.print(a + " ");
		}
		while(iteration <= num);
	}
}