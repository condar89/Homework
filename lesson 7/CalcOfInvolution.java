import java.util.Scanner;

public class CalcOfInvolution{
	public static void main(String[] args){
		System.out.println("Please insert your number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		int iteration = 1;
		int result = 1;
		for( ;  iteration <=number ; iteration++){
		result *=number;
		}
		System.out.println("Result is: " + result);
    	}
}