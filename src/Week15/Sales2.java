package Week15;

/**
 * Created by David Chenette on 4/20/2016.
 */
import java.util.Scanner;

public class Sales2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in);
        double[][] sales = new double[5][4];

        System.out.print("Enter sales person number (-1 to end): ");
        int person = input.nextInt();

        while (person != -1)
        {
            System.out.print("Enter product number; ");
            int product = input.nextInt();
            System.out.print("Enter sales amount: ");
            int amount = input.nextInt();

            if (person >= 1 && person <= 4 && product >= 1 && product <= 5  )
            {
                sales[product - 1][person - 1] += amount;
            }
            else
            {
                System.out.println("Invalid input!:");
            }

            System.out.print("Enter sales person number (-1 to end): ");
            person = input.nextInt();
        }

        double salesPersonTotal[] = new double [5];

        for ( int column = 0; column < 5; column++)
        {
            salesPersonTotal[column] = 0;

        }
        System.out.printf( "%7s%14s%14s%14s%14s%10s\n",
                "Product", "Salesperson 1", "Salesperson 2",
                "Salesperson 3", "Salesperson 4", "Total" );

        for ( int row = 0; row < 5; row++ )
        {
            double productTotal = 0.0;
            System.out.printf( "%7d", ( row + 1 ) );

            for ( int column = 0; column < 4; column++ )
            {
            System.out.printf( "%14.2f", sales[ row ][ column ] );
            productTotal += sales[ row ][ column ];
            salesPersonTotal[ column ] += sales[ row ][ column ];
             }
            System.out.printf( "%10.2f\n", productTotal );
        }
        System.out.printf( "%7s", "Total" );

        for ( int column = 0; column < 4; column++ )
        {
            System.out.printf("%14.2f", salesPersonTotal[column]);
        }

        System.out.println();
    }
}

