import java.util.Scanner;

public class CalcTheOddAndEvenNumbers{
	public static void main(String[] args){
	System.out.println("Please insert your number");
	Scanner scanner = new Scanner(System.in);
	
	
	int iteration = 1;
	int sum = 0, evenSum = 0, oddSum = 0;
	for ( ; iteration <= 10; iteration++){
	System.out.println("\nInsert your " + iteration + " number");
		int number = scanner.nextInt();
        	if (number % 2 > 0){
			oddSum++;
		}
		else {
		evenSum++;
		}
	}    
	System.out.println("\nEven numbers introduced: " + evenSum);
	System.out.println("\nOdd numbers introduced: " + oddSum);
    	
}
}