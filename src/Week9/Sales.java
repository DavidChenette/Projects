package Week9;

import java.util.Scanner;

/**
 * Created by David Chenette on 3/16/2016.
 */
public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ProductNumber = 1;
        int quantity;
        double product1 = 0;
        double product2 = 0;
        double product3 = 0;
        double product4 = 0;
        double product5 = 0;


        while (ProductNumber != 0)
        {
            System.out.print("Enter product Number (1-5) (0 to stop):");
            ProductNumber = input.nextInt();

            switch (ProductNumber)
            {
                case 1:
                    System.out.print("Enter quantity sold:");
                    quantity = input.nextInt();
                    product1 = quantity * 2.98;
                    break;
                case 2:
                    System.out.print("Enter quantity sold:");
                    quantity = input.nextInt();
                    product2 = quantity * 4.50;
                    break;
                case 3:
                    System.out.print("Enter quantity sold:");
                    quantity = input.nextInt();
                    product3 = quantity * 9.98;
                    break;
                case 4:
                    System.out.print("Enter quantity sold:");
                    quantity = input.nextInt();
                    product4 = quantity * 4.49;
                    break;
                case 5:
                    System.out.print("Enter quantity sold:");
                    quantity = input.nextInt();
                    product5 = quantity * 6.87;
                    break;


            }
        }
        System.out.printf("Product 1: $%.2f\n", product1);
        System.out.printf("Product 2: $%.2f\n", product2);
        System.out.printf("Product 3: $%.2f\n", product3);
        System.out.printf("Product 4: $%.2f\n", product4);
        System.out.printf("Product 5: $%.2f\n", product5);

    }
}
