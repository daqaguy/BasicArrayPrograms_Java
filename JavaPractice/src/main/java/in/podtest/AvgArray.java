package in.podtest;

public class AvgArray
{
    public static void main(String[] args)
    {
        double numbers[] = {1.7,2.2,3.4,4.8,5.6};
        double average = calculateAverage(numbers);
        System.out.println("Average of numbers : "+average);
    }

    public static double calculateAverage(double[] array)
    {
        double sum = 0.0;
        for (double i : array)
        {
            sum = sum + i;
        }
        return sum/array.length;
    }
}
