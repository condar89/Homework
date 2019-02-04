import java.util.Scanner;

public class CalcSumOfEvenNumbers{
	public static void main(String[] args){
	System.out.println("Please insert your number");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	scanner.close();
	int iteration = 0;
	int sum = 0;
	for ( ; iteration <= number; iteration++){
        if(iteration % 2 > 0){
                 continue;
        }
	sum += iteration;
	}
	System.out.println("\nSum is: " +sum);
    	}
}