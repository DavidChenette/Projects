package Week11;

        import java.util.Scanner;

/**
 * Created by David Chenette on 3/21/2016.
 */
public class HW532 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 value");
        int x1 = input.nextInt();
        System.out.println("Enter y1 value");
        int y1 = input.nextInt();
        System.out.println("Enter x2 value");
        int x2 = input.nextInt();
        System.out.println("Enter y2 value");
        int y2 = input.nextInt();

        double x = (x2 - x1)*(x2 - x1);
        double y = (y2 - y1)*(y2 - y1);
        double z = x + y;

        double distance;
        distance = Math.sqrt (z);

        System.out.printf("%.2f", distance);
    }
}
