package Week11;

/**
 * Created by David Chenette on 3/21/2016.
*/

        import java.util.Scanner;

public class HW520 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double area = circleArea(input.nextInt());
        System.out.printf("%.2f", area);
    }
    public static double circleArea(double radius) {
        double area = (3.1415 * radius * radius);
        return area;
    }
}
