package Week14;

/**
 * Created by David Chenette on 4/20/2016.
 */
import java.util.Scanner;
public class HW612 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        int[]digits=new int[4];
        int count=0;
        int entered=0;
        int num;

        while (entered<digits.length) {
            System.out.print("Enter a number between 10 and 100: \n");
            num = input.nextInt();
            if ((num>=10)&&(num<=100)) {
                boolean isDup=false;
                entered++;

                for (int i=0;i<digits.length;i++) {
                    if (digits[i]==num)
                        isDup=true;
                    entered--;//do not add duplicate digits to array
                }

                if (!isDup) {
                    digits[count]=num;
                    count++;
                }
                else
                    System.out.printf("%d is a duplicate number\n", num);

                for(int i=0;i<count;i++) {
                    System.out.printf(digits[i] + " ");
                }
            }
        }
    }
}