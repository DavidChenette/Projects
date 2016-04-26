package Week5;

import java.util.Scanner;

/**
 *this is document header
 Assignment: week 5 homework, ex. ndromepali
 Name: David Chenette
 Date: feb, 17, 2016
 */
public class Palindrome {                               //palindrome class header
    public static void main(String[] args) {            //main method header

        Scanner input = new Scanner(System.in);         //create Scanner to obtain input

        int number ;                                   // variable initialization
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        System.out.print("Enter five digit integer: ");      //ask for five digit integer
        number = input.nextInt();

        num1 = number / 10000;                         //Find the value of each digit 1-5
        num5 = number % 10;
        number = number % 10000;
        num2 = number / 1000;
        number = number % 1000;
        num3 = number / 100;
        number = number % 100;
        num4 = number / 10;

        if (num1 == num5 & num2 == num4)                //determining if it is palindrome or not ( if it is)
        {
            System.out.printf("It is a palindrome\n");
        }
        if (num1 != num5)                               //if it isnt
        {
            System.out.printf("It is not a palindrome\n");
        }



    }                                                   //end main method
}                                                       //end of class Panlindrome
