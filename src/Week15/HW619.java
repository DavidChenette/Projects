package Week15;

/**
 * Created by David Chenette on 4/25/2016.
 */
import java.util.Arrays;
import java.util.Scanner;

public class HW619 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean[] firstClass = new boolean[5];
        boolean[] economyClass = new boolean[5];
        int numFirstClass = 0;
        int numEconomyClass = 0;
       for(int i =0; i <11;i++) {
            System.out.println("Press 1 for economy and 2 for first class.");
            int choice = input.nextInt();
            if (choice == 1)
                economyClassMM(numEconomyClass, numFirstClass, firstClass, economyClass);
            else if (choice == 2)
                firstClassMM(numEconomyClass, numFirstClass, economyClass, firstClass);
            else
                System.out.println("Invalid selection");
       }

}
    public static int firstClassMM(int numEconomyClass,int numFirstClass, boolean[] firstClass,boolean[] economyClass ){
        Scanner input = new Scanner(System.in);
        if (numFirstClass < 5){
            for (int i = 0; i < firstClass.length; i++){
                if(!firstClass[i]){
                    firstClass[i] = true;
                    System.out.println("First Class. Seat number: "+(i+1));
                    numFirstClass++;
                    break;
                }
            }
        }
        else if (numEconomyClass < 5){
            System.out.println("No more 1st class. Press 1 if you would like to book an economy class ticket.");
            int choice = input.nextInt();
            if (choice == 1)
                economyClassMM(numEconomyClass,numFirstClass,economyClass,firstClass);
            else
                System.out.println("The next flight leaves in 3 hours.");
        }
        else
            System.out.println("All booked, the next flight leaves in 3 hours.");
        return numFirstClass;
    }

    public static int economyClassMM(int numEconomyClass,int numFirstClass,boolean[] firstClass, boolean[] economyClass){
        Scanner input = new Scanner(System.in);
        if (numEconomyClass < 5){
            for (int i = 0; i < economyClass.length; i++){
                if(!economyClass[i]){
                    economyClass[i] = true;
                    System.out.println("Economy Class. Seat number: "+(i+6));
                    numEconomyClass++;
                    break;
                }

            }
        }
        else if (numFirstClass < 5){
            System.out.println("No more economy. Press 1 if you would like to book an first class ticket.");
            int choice = input.nextInt();
            if (choice == 1)
                firstClassMM(numEconomyClass,numFirstClass,economyClass,firstClass);
            else
                System.out.println("The next flight leaves in 3 hours.");
        }
        else
            System.out.println("All booked, the next flight leaves in 3 hours.");
        return numEconomyClass;
    }
    //suck it world
}