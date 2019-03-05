package employeemanager;

import java.util.Scanner;
import employeemanager.models.implementations.Bookkeeper;
import employeemanager.models.implementations.Programmer;

public class App {

    /**
     * @param args the command line arguments;
     */
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.name = "Ion";
        Bookkeeper bookkeeper = new Bookkeeper("Ion", "Vasile");
        bookkeeper.name = "Ion";

        char choice;
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            do {
                System.out.println("Help on:");
                System.out.println(" 1. Bookkeeper");
                System.out.println(" 2. Manager");
                System.out.println(" 3. Programmer");
                System.out.println(" 4. Salesman");
                System.out.println(" 5. Technician");
                System.out.print("Choose one (q to quit): ");
                choice = scanner.next().charAt(0);

            } while (choice < '1' | choice > '5' & choice != 'q');
            if (choice == 'q') {
                break;
            }
            System.out.println("\n");
            switch (choice) {
                case '1':
                    System.out.println("The Bookkeeper\n");
                    break;
                case '2':
                    System.out.println("The Manager:\n");
                    break;
                case '3':
                    System.out.println("The Programmer:\n");
                    break;
                case '4':
                    System.out.println("The Salesman:\n");
                    break;
                case '5':
                    System.out.println("The Technician:\n");
                    break;
            }
            System.out.println();
        }
    }
}
