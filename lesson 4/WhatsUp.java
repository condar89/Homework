import java.util.Scanner;

public class WhatsUp {
	public static void main(String[] args){
		String version = System.getProperty("java.version");
		System.out.println("\nHello Stranger");
		System.out.println("\nLet's get to know each other");
		System.out.println("\nWhat's your name: ");
		Scanner reader = new Scanner(System.in);
		String userName = reader.next();
		System.out.println("\nWhat's your surname: ");
		String userSurName = reader.next();
		System.out.println("\nWhat is your profession: ");
		String userProfession = reader.next();
		reader.close();
		System.out.print("\nNice to meet you, " + userName);
		System.out.print( " " + userSurName + "." );
		System.out.println( " Whose profession is " + userProfession );
		System.out.println("\nI am Java " + version);
	}
}