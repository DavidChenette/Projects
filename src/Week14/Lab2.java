package Week14;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by David Chenette on 4/13/2016.
 */
public class Lab2 {
    public static void main(String[] args)
    {
        int[] numbers = new int[20];


        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100 + 0);
        }
        int sum = IntStream.of(numbers).sum();
        double average = sum / 20.;
        System.out.println("List of Grades: " + Arrays.toString(numbers));
        System.out.printf("The sum of grades is %d\n", sum);
        System.out.printf("The average of grades is %.2f\n", average);

        int smallest = numbers[0];
        int largest = numbers[0];

        for(int i=1; i< numbers.length; i++)
        {
            if(numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];


        }
        System.out.printf("The highest score is %d\n", largest);
        System.out.printf("The lowest score is %d\n", smallest);
    }
}
