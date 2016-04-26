package Week15;

/**
 * Created by David Chenette on 4/20/2016.
 */
import java.util.Random;
public class myArray {
    public static void main(String[] args) {
        int[] a = new int [5];
        int total = 0;
        Random rand = new Random();

        for (int i = 0; i < a.length; i++)
        {
            a[i] = rand.nextInt(6) + 1;
            System.out.println(a[i]);
        }

        for (int elementValue: a)
        {
            total += elementValue;
        }
         System.out.println("sum is"+total);

    }

    static int sumOfArray (int[] arr)
    {
        int total = 0;
        for (int elementValue: arr)
        {
            total += elementValue;

        }
        System.out.println("sum is"+total);
        return total;
    }
}
