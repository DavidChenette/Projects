package Week14;
/**
 * Created by David Chenette on 4/20/2016.
 */

import java.util.Random;


public class HW617b {
    static Random randomNum = new Random();
    static final int SideOnDice = 6;
    static final int NumOfTimes = 36000000;


    public static void main(String[] args) {
        int[] frequency = countRollFrequencies(NumOfTimes);
        displayFrequencies(frequency);
    }

    static int[] countRollFrequencies(int repetitions) {
        int maxRoll = SideOnDice + SideOnDice;
        int[] result = new int[maxRoll + 1];
        for(int i = 0; i < repetitions; i++){
            ++result[rollTwoDice()];
        }
        return result;
    }

    static int rollTwoDice() {
        return rollDice() + rollDice();
    }

    static int rollDice(){
        return 1 + randomNum.nextInt(SideOnDice);
    }
    static void displayFrequencies(int[] frequency) {
        int minRoll = 2;
        for(int i = minRoll; i < frequency.length; i++){
            System.out.printf("%4d%10d\n", i, frequency[i]);
        }
    }
}



