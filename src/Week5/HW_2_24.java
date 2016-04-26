package Week5;

import java.util.Scanner;

/**
 *this is document header
 Assignment: week 5 homework, ex. 2.24
 Name: David Chenette
 Date: feb, 17, 2016
 */


                                                        //Largest and Snallest integers
public class HW_2_24                                    //2.24 class header
{
    public static void main(String[] args)              //main method header
    {
        Scanner input = new Scanner(System.in);         //create Scanner to obtain input

        int greatest;                                   // variable initialization
        int least;
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        System.out.print("Enter fisrt integer: ");      //ask for first integer
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");     //ask for second int
        num2 = input.nextInt();

        System.out.print("Enter third integer: ");      //ask for third int
        num3 = input.nextInt();

        System.out.print("Enter fourth integer: ");     //ask for fourth int
        num4 = input.nextInt();

        System.out.print("Enter fifth integer: ");      //ask for fifth int
        num5 = input.nextInt();

        greatest = num1;
        least = num1;

        if (num2 > greatest) {                          //finding greatest int
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        if (num4 > greatest){
            greatest = num4;
        }
        if (num5 > greatest){
            greatest = num5;
        }


        if (num2 < least) {                             // finding least int
            least = num2;
        }
        if (num3 < least) {
            least = num3;
        }
        if (num4 < least){
            least = num4;
        }
        if (num5 < least){
            least = num5;
        }


        System.out.printf("The Largest number is %d\n", greatest );     //displaying greatest
        System.out.printf("The Smallest number is %d", least );         //displaying least
    }
}

