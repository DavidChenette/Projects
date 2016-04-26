package Week7;

/**
 * Created by David Chenette on 2/23/2016.
 */
public class HW332 {
    public static void main(String[] args) {
        int rows = 8;
        int spaces= 8;
        int currentRow = 0;
        int currentSpace = 0;
        while (currentRow < rows)
        {
            currentSpace = 0;
            if (currentRow % 2 == 0)
            {
                while (currentSpace < spaces) {
                    System.out.print("* ");
                    currentSpace++;
                }
            }
            currentSpace = 0;
            if (currentRow % 2 == 1)
            {
                while (currentSpace < spaces) {
                    System.out.print(" ");
                    System.out.print("*");
                    currentSpace++;
                }

            }
            System.out.println();
            currentRow++;
        }
    }
}
