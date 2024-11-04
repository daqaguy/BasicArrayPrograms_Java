package in.podtest;

public class JavaArray
{
    public static void main(String[] args)
    {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and print elements of the array
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Sum of all elements in the array
        int sum = 0;
        for (int num : numbers)
        {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        // Calling the method to find the maximum
        int max = findMax(numbers);
        System.out.println("Maximum value: " + max);

        // Calling the method to search for the element
        int searchValue = 3;
        int index = findIndex(numbers, searchValue);
        if (index != -1)
        {
            System.out.println("Element found at index: " + index);
        }
        else
        {
            System.out.println("Element not found.");
        }
    }

    // Method to find the maximum value in an array
    public static int findMax(int[] array)
    {
        int max = array[0];
        for (int num : array)
        {
            if (num > max)
            {
                max = num;
            }
        }
        return max;
    }

    // Method to find the index of a specific element
    public static int findIndex(int[] array, int value)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
