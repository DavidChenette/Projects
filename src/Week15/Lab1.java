package Week15;

/**
 * Created by David Chenette on 4/20/2016.
 */
import java.util.Random;


public class Lab1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int [][] arr = new int[a][b];
        createArray(arr);
        printArray(arr);
        largestRow(arr);
    }
    public static void createArray(int [][] array) {

        Random rand = new Random();
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
               array[i][j]= rand.nextInt(21);
            }
        }
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                int value = array[i][j];
                System.out.print("  "+ value);
            }
            System.out.println(" ");

        }
    }
    public static void largestRow(int[][] arr) {

        int sum = 0;
        int largest = -1;
        int rowNumberber= 0;

        for (int r = 0; r < 3; r++) {

            for (int c = 0; c < 4; c++)
            {
                sum += arr[r][c];
            }
            if( sum > largest)
            {
                largest = sum;
                rowNumberber = r + 1;
            }
            sum = 0;
        }
        System.out.println("  # is " + rowNumberber);
        System.out.println("  largest is " + largest);
    }
}



