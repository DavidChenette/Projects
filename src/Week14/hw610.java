package Week14;

/**
 * Created by David Chenette on 4/20/2016.
 */
import java.util.Scanner;
public class hw610 {
    public static void main(String[] args) {
            int counter_array[] = new int[9];
            double gross_sales;


            Scanner input = new Scanner( System.in );
            System.out.printf( "Enter sales amount (Negative to end) ");
            gross_sales = input.nextDouble();
            double salary = ((gross_sales * 0.09) + 200);
            //System.out.println(" "+salary);
            while ( gross_sales >= 0 )
            {
                    //  salary = getSalary( gross_sales );
                    // increaseArray( salary, counter_array );
                    System.out.printf( "Enter sales amount (Negative to end) ");
                    gross_sales = input.nextInt();
            }



            //salary = getSalary(gross_sales);
           // getSalary(salary);
            increaseArray(salary,counter_array);
            displayMessage(counter_array);



    }
       /* public static double getSalary( double gross_sales )
        {
        double salary = ((gross_sales * 0.09) + 200);
        return salary;
        }*/

        public static void displayMessage(int counter_array[])
{
    for (int displaycount = 0; displaycount < 9; displaycount++)
    {
            System.out.printf( "%4d%4d ", (displaycount + 2) * 100, ((displaycount + 2) * 100) + 99);
            System.out.println(displaycount + ": " + counter_array[displaycount]);
    }
}

        public static void increaseArray( double salary, int counter_array [] )
        {

                if (salary >= 1000.00) {
                        counter_array[8] += 1;
                } else if (salary >= 900.00) {
                        counter_array[7] += 1;
                } else if (salary >= 800.00) {
                        counter_array[6] += 1;
                } else if (salary >= 700.00) {
                        counter_array[5] += 1;
                } else if (salary >= 600.00) {
                        counter_array[4] += 1;
                } else if (salary >= 500.00) {
                        counter_array[3] += 1;
                } else if (salary >= 400.00) {
                        counter_array[2] += 1;
                } else if (salary >= 300.00) {
                        counter_array[1] += 1;
                } else if (salary >= 200.00) {
                        counter_array[0] += 1;
                }
        }

public static double salesMethod(double gross_sales)
        {
        int counter_array[] = new int [ 9 ];
        gross_sales = 0;
        double salary;

        Scanner input = new Scanner( System.in );
        System.out.printf( "Enter sales amount (Negative to end) ");
        gross_sales = input.nextDouble();

        while ( gross_sales >= 0 )
                {
                      //  salary = getSalary( gross_sales );
                       // increaseArray( salary, counter_array );
                        System.out.printf( "Enter sales amount (Negative to end) ");
                        gross_sales = input.nextInt();
                }

                return gross_sales;


        }
}

