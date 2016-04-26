package Week15;

/**
 * Created by David Chenette on 4/20/2016.
 */

import java.util.Scanner; // program uses class Scanner

public class HW615
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner( System.in);
        int size;




        if (args.length == 0 )
        {
            size = 10;
        }
        else
        {
            size = Integer.parseInt( args[ 0 ]);
        }
        int a[] = new int [size];


        System.out.printf( "%s%8s\n", "Index", "Value" );

        for ( int counter = 0; counter < a.length; counter++ )
        {
            System.out.printf("%5d%8d\n", counter, a[counter]);
        }
    }
}