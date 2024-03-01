package Lab5_SequenceOperations;

public class SequenceOperations {

    public static double getTotal(double array[])
    {
        double total = 0;
        for (int i = 0; i < array.length; i++)
        {
            total += array[i];
        }
        return total;
    }

    public static double getAverage(double array[])
    {
        double total = 0;
        for (int i = 0; i < array.length; i++)
        {
            total += array[i];
        }
        return total / array.length;
    }

    public static double getHighest(double array[])
    {
        double high = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] > high)
            {
                high = array[i];
            }
        }
        return high;
    }

    public static double[] getReverse(double[] array)
    {
        double[] revArray = new double[array.length];

        for (int i = 0; i < array.length; i++)
        {
           revArray[i] = array[array.length - 1 - i];
        }
        return revArray;
    }

}
