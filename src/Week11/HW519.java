package Week11;

        import java.util.Scanner;

/**
 * Created by David Chenette on 3/21/2016.
 */
public class HW519 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         //create Scanner to obtain input
        System.out.println("Enter a number for the side of square");
        int m = input.nextInt();
        System.out.println("Enter Character");
        char Char = input.next().charAt( 0 );

        int n = 0, n2 = 0;
        while (n2<m)
        {

            n = 0;
            while (n < m) {

                System.out.printf("%s", Char);
                n++;
            }
            System.out.println("");
            n2++;
        }
    }
}