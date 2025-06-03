public class NumbersRiddle
{
    public static void main(String[] args)
    {
        // variables for testing
        int positive = 7;
        int negative = -7;
        int zero = 0;
        int one = 1;
        double positiveDouble = 1.243;
        double negativeDouble = -1.243;

        /*
         * assign number to start with
         * if it's an int add (double)
         */
        double startNumber = negativeDouble;

        // calculations
        double doubleIt = startNumber * 2;
        double addSix = doubleIt + 6;
        double divideInHalf = addSix / 2;
        double subtractStart = divideInHalf - startNumber;
        double finalResult = subtractStart;

        // print output
        System.out.println("Starting number: " + startNumber);
        System.out.println("Doubled: " + startNumber + " * 2 = " + doubleIt);
        System.out.println("Add 6: " + doubleIt + " + 6 = " + addSix);
        System.out.println("Divide in half: " + addSix + " / 2 = " + divideInHalf);
        System.out.println("Subtract starting number: " + divideInHalf + " - " + startNumber + " = " + subtractStart);
        System.out.println("Final result: " + finalResult);
    }
}
