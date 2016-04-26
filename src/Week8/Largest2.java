import java.util.Scanner;

public class Largest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = -2147483648;
        int secondLargest = -2147483648;
        int number;
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Enter Number:");
            number = input.nextInt();
            if (largest < number) {
                secondLargest = largest;
                largest = number;
            } else if (secondLargest < number) {
                secondLargest = number;
            }
            counter++;
        }
        System.out.printf("Two largest numbers are %d and %d", largest, secondLargest);
    }
}