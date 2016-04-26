package Week8;

/**
 * Created by David Chenette on 2/24/2016.
 */

        import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int account = 1;
        int oldBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;


        while (account != 0) {
            System.out.print("Enter Account Number (or -a to quit):");
            account = input.nextInt();
            System.out.print("Enter Balance");
            oldBalance = input.nextInt();
            System.out.print("Enter Charges");
            charges = input.nextInt();
            System.out.print("Enter Credits");
            credits = input.nextInt();
            System.out.print("Enter Credit Limit:");
            creditLimit = input.nextInt();

            newBalance = oldBalance + charges - credits;
            System.out.printf("New balance is %d\n", newBalance);
            if (creditLimit < newBalance){
                System.out.println("Credit limit exceeded\n");
            }
            else {
                System.out.println("");
            }

        }
    }
}

