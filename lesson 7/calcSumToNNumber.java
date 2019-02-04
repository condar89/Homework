import java.util.Scanner;

public class calcSumToNNumber{
	public static void main(String[] args){
	System.out.println("Please insert your number");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	scanner.close();
	int iteration = 0;
	int sum = 0;
	while(iteration <= number){
		sum +=iteration;
		iteration++;
		}
	System.out.println("Sum is: " +sum);
    	}
}
	