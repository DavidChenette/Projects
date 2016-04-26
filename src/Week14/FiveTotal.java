package Week14;

import java.util.Random;

/**
 * Created by David Chenette on 4/13/2016.
 */
public class FiveTotal {
    public static void main(String[] args) {
        int[] a = new int[5];
        Random rand = new Random();
        int sum = 0;
        for (int i=0;i<5;i++)
        {
            a[i]=rand.nextInt(6)+1;
            System.out.println(a[i]);
            sum += a[i];
        }

        System.out.println("sum is "+sum);
    }
}
