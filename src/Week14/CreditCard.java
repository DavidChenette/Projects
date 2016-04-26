package Week14;

/**
 * Created by David Chenette on 4/13/2016.
 * Errr, I did it by myself
 */
import java.util.Scanner;
public class CreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //4388576018402626 is Invalid, 4388576018410707 is Valid

        System.out.print("Please Enter your credit card number: ");
        long creditcard = input.nextLong();

        int[] digits = getDigits(creditcard);
        int sumDoubleEvenDigit = sumEvenPlaces(digits);
        int sumOddDigit = sumOddPlaces(digits);
        int totalSum = sumDoubleEvenDigit + sumOddDigit;
        isValidNumber(totalSum);

    }
    public static void isValidNumber (int totalSum)
    {
        if (totalSum % 10 == 0)
            System.out.println("Your credit card number is valid");
        else
            System.out.println("Your credit card number is invalid");
    }
    public static int[] getDigits(long creditcard) {
        long number = creditcard;
        int length = (int) Math.log10(number) + 1;
        int[] digits = new int[length];

        //System.out.println(length);

        for (int i=length -1; i>=0; i--) {
            int digit = (int) (creditcard % 10);
            digits[i] = digit;
            creditcard /= 10;
        }
        return digits;
    }
    public static int sumEvenPlaces(int[] digits) {
        int sum = 0;
        for (int i=0; i<digits.length; i+=2) {
            int doubledValue = digits[i] << 1;

            if (doubledValue >= 10)

            sum += 1 + doubledValue - 10;
            else
            sum += doubledValue;
        }
        return sum;
    }
    public static int sumOddPlaces(int[] digits) {
        int sum = 0;
        for (int i=1; i<digits.length; i+=2)
        sum += digits[i];
        return sum;
    }
}
