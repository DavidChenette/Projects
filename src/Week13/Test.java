package Week13;

import java.util.Scanner;

/**
 * Created by David Chenette on 4/6/2016.
 */
public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int speed;

        for (int i =0; i < 10; i++)
        {
            System.out.println("Please enter mph speed value between 39 and 170");
            speed = input.nextInt();

            System.out.printf("the Hurricane is a %s\n", findCategory(speed));

        }
    }
    public static String findCategory(int speed)
    {
        if (speed >= 156 && speed <= 170) {
            return String.format("Tropical Storm");}
        else {
        return String.format("Tropical Storm");}
    }
}