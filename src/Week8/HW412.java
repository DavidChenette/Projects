package Week8;



/**
 * Created by David Chenette on 3/15/2016.
 */


public class HW412 {
    public static void main(String[] args) {

        int total = 1;

        for (int i = 1; i <= 15; i++)
        {
            if( i%2 == 1)
            {
                total *= i;
            }
        }
        System.out.println("" + total);
    }
}
