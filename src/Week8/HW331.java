package Week8;

import java.util.Scanner;

/**
 * Created by David Chenette on 3/2/2016.
 */
public class HW331 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary integer: ");
        int a=input.nextInt();
        int numOfDigits=1;
        int q=a;

        while(q/10>=1){
            ++numOfDigits;
            q/=10;
        }
        int decimal=0;
        int i=0;
        while(i<=numOfDigits-1){
            decimal+=a/Math.pow(10,i)%10*Math.pow(2,i);
            i++;
        }
        System.out.println(decimal);

    }
}

