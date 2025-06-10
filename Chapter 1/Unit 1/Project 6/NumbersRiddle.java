public class NumbersRiddle
{
    public static void main(String[] args)
    {
        // variables for testing
        int positiveInt = 7;
        int negativeInt = -7;
        int zero = 0;
        int one = 1;
        double positiveDouble = 1.243;
        double negativeDouble = -1.243;

        /*
         * assign number to start with
         * use any int or double or use testing variables
         */
        double startNumber = positiveInt;

        // calculations
        double doubleIt = startNumber * 2;
        double addSix = doubleIt + 6;
        double divideInHalf = addSix / 2;
        double subtractStart = divideInHalf - startNumber;
        int finalResult = (int) subtractStart;

        // print numbers and calculations
        System.out.println("Starting number: " + startNumber);
        System.out.print("\n");
        System.out.println("Doubled: " + startNumber + " * 2 = " + doubleIt);
        System.out.println("Add 6: " + doubleIt + " + 6 = " + addSix);
        System.out.println("Divide in half: " + addSix + " / 2 = " + divideInHalf);
        System.out.println("Subtract starting number: " + divideInHalf + " - " + startNumber + " = " + subtractStart);
        System.out.print("\n");
        System.out.println("Final result: " + finalResult);
    }
}