package Week9;

/**
 * Created by David Chenette on 3/16/2016.
 */
public class Triangle4 {
    public static void main(String[] args) {
        for(int i = 0; i < 10;i++)
        {
            for (int j = 1 ; j<=(10 - i);j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
