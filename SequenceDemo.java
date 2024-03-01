package Lab5_SequenceOperations;

import java.util.Arrays;

public class SequenceDemo {
    public static void main(String[] args)
    {
        double[] array = {3.0, 2.4, 6.0, 2.0, 4.0, 5.1, 7.2};

        System.out.println("Processing Array: "+ Arrays.toString(array));
        System.out.println("Total: "+SequenceOperations.getTotal(array));
        System.out.printf("Average: %,.2f",SequenceOperations.getAverage(array));
        System.out.println("\nHighest value: "+SequenceOperations.getHighest(array));

        double[] reverse = SequenceOperations.getReverse(array);
        System.out.println("Array Reverse: "+Arrays.toString(reverse));

    }
}
