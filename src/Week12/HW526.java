package Week12;

/**
 * Created by David Chenette on 4/6/2016.
 */
import java.util.Scanner;

public class HW526
{
    public static void main(String args[])
    {
        int n, reverse = 0;

        System.out.println("Enter the number to reverse");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();


        System.out.println("Reverse of entered number is "+calculateReverset(n));
    }
    static int calculateReverset(int n)
    {
        int reverse = 0;
        while( n != 0 )
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        return reverse;
    }
}