package calculator;

/**
 * This is a class that contains algebra operation
 *
 * @author 37367
 */
public class Algebra {

    public void detectOddOrEven(int number) {
        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println("Result: " + number + " is " + result);
    }

    public int calculateSum(int aNumberForSum, int bNumberForSum) {
        int sum = aNumberForSum + bNumberForSum;
        return sum;
    }

    public int calculateMinus(int aNumberforMinus, int bNumberForMinus) {
        int minus = aNumberforMinus - bNumberForMinus;
        return minus;
    }

    public int calculateTimes(int aNumberForTimes, int bNumberForTimes) {
        int times = aNumberForTimes * bNumberForTimes;
        return times;
    }
    public float calculateObelus(int aNumberForObelus, int bNumberForObelus){
        float obelus = (float) aNumberForObelus / bNumberForObelus;
        return obelus;
        
    }

}
