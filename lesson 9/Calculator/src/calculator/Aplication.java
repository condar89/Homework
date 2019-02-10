package calculator;

/**
 *
 * @author 37367
 */
import java.util.Scanner;

public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. User input
        Scanner keyboardScanner = new Scanner(System.in);

        Geometry geometry = new Geometry();
        System.out.println("Please enter square side");
        int squareSide = keyboardScanner.nextInt();
        int surface = geometry.calculateSquareSurface(squareSide);
        int perimeter = geometry.calculateSquarePerimeter(squareSide);
        System.out.println("Square Perimeter " + perimeter + " Square Surface " + surface);
        System.out.println("Please enter rectangle lenght and width");
        int rectWidth = keyboardScanner.nextInt();
        int rectLenght = keyboardScanner.nextInt();
        int rectanglePerimeter = geometry.calculateRectanglePerimeter(rectWidth, rectLenght);
        int rectangleSurface = geometry.calculateRecatangleSurface(rectWidth, rectLenght);
        System.out.println("Rectangle Perimeter " + rectanglePerimeter + " Rectangle Surface " + rectangleSurface);
        System.out.println("\nPlease enter the rhombus side lenght and height");
        int rhombusSideLenght = keyboardScanner.nextInt();
        int rhombusHeight = keyboardScanner.nextInt();
        int rhombusPerimeter = geometry.calculateRhombusPerimeter(rhombusSideLenght);
        int rhombusSurface = geometry.calculateRhombusSurface(rhombusSideLenght, rhombusHeight);
        System.out.println("\nRhombus Perimeter " + rhombusPerimeter + " Rhombus Surface " + rhombusSurface);
        System.out.println("\nPlease enter the triangle hypotenuse , cathetesA, cathetesB and height");
        int hypotenuse = keyboardScanner.nextInt();
        int cathetesA = keyboardScanner.nextInt();
        int cathetesB = keyboardScanner.nextInt();
        int triangleHeight = keyboardScanner.nextInt();
        int trianglePerimeter = geometry.calculateTrianglePerimeter(hypotenuse, cathetesA, cathetesB);
        int triangleSurface = geometry.calculateTriangleSurface(hypotenuse, triangleHeight);
        System.out.println("\nTriangle Perimeter " + trianglePerimeter + " Triangle Surface " + triangleSurface);

        System.out.println("\nPlease enter number to check");
        int number = keyboardScanner.nextInt();
        Algebra algebra = new Algebra();
        algebra.detectOddOrEven(number);
        System.out.println("\nIn order to calculate sum, please enter 2 numbers");
        int aNumberForSum = keyboardScanner.nextInt();
        int bNumberForSum = keyboardScanner.nextInt();
        int sum =algebra.calculateSum(aNumberForSum, bNumberForSum);
        System.out.println("Sum is " + sum);
        System.out.println("\nIn order to calculate the difference, please insert 2 numbers");
        int aNumberForMinus = keyboardScanner.nextInt();
        int bNumberForMinus = keyboardScanner.nextInt();
        int minus =algebra.calculateMinus(aNumberForMinus, bNumberForMinus);
        System.out.println("The difference is " + minus);
        System.out.println("\nIn order to calculate the times, please insert 2 numbers");
        int aNumberForTimes = keyboardScanner.nextInt();
        int bNumberForTimes = keyboardScanner.nextInt();
        int times = algebra.calculateTimes(aNumberForTimes, bNumberForTimes);
        System.out.println("The Times is " + times);
        System.out.println("\nIn order to calculate the obelus, please insert 2 numbers");
        int aNumberForObelus = keyboardScanner.nextInt();
        int bNumberForObelus = keyboardScanner.nextInt();
        float obelus = algebra.calculateObelus(aNumberForObelus, bNumberForObelus);
        System.out.println("Obelus is " + obelus);

        System.out.println("How many Fibonacci numbers to print?");
        int count = keyboardScanner.nextInt();
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        fibonacciGenerator.generateFibonacciList(count);
    }

}
