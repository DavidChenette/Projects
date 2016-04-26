package Week5;

import java.util.Scanner;

/**
 *this is document header
 Assignment: week 5 homework, ex. 2.32
 Name: David Chenette
 Date: feb, 17, 2016
 */
public class HW_2_32 {                                  //2.32 class header
    public static void main(String[] args) {            //main method header


        Scanner input = new Scanner(System.in);         //create Scanner to obtain input

        int positive = 0;                                   // variable initialization
        int negative = 0;
        int zero = 0;
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



        if (num1 == 0){                                 //determining how many zeros there are
            zero = zero + 1;
        }
        if (num2 == 0){
            zero = zero + 1;
        }
        if (num3 == 0){
            zero = zero + 1;
        }
        if (num4 == 0){
            zero = zero + 1;
        }
        if (num5 == 0){
            zero = zero + 1;
        }


        if (num1 > 0){                                  //determining how many positives there are
            positive = positive + 1;
        }
        if (num2 > 0){
            positive = positive + 1;
        }
        if (num3 > 0){
            positive = positive + 1;
        }
        if (num4 > 0){
            positive = positive + 1;
        }
        if (num5 > 0){
            positive = positive + 1;
        }



        if (num1 < 0){                                  //determining how many negatives there are
            negative = negative + 1;
        }
        if (num2 < 0){
            negative = negative + 1;
        }
        if (num3 < 0){
            negative = negative + 1;
        }
        if (num4 < 0){
            negative = negative + 1;
        }
        if (num5 < 0){
            negative = negative + 1;
        }

        System.out.printf("There are %d positive numbers\n", positive );        //displaying positive numbers
        System.out.printf("There are %d negative numbers\n", negative );        //displaying negative numbers
        System.out.printf("There are %d zero numbers", zero );                  //displaying zero numbers
    }                                                                           //end main method
}                                                                               //end of class HW_2_32
