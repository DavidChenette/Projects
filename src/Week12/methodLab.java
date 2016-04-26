package Week12;

/**
 * Created by David Chenette on 3/30/2016.
 */
import java.util.Scanner;

public class methodLab {
    public static void main(String[] str) {
        Scanner input = new Scanner (System.in);

        greeting("David Chenette");

        rectangle(3, 6);

        for ( int i=0;i<5;i++){
            System.out.println("enter grade");
            int g = input.nextInt();
            System.out.println("the letter grade is " + gradebook(g));
        }
        System.out.println("enter radius");
        double r = input.nextDouble();
        System.out.println("area is " + area(r));
    }
    static String gradebook(int n)
    {
        String letterGrade;
        if (n>=90)  letterGrade = "A";
        else if (n>= 80) letterGrade = "B";
        else if (n>= 70) letterGrade = "B";
        else letterGrade = "f";
        return letterGrade;
    }
    static double area(double radius)
    {
        double a = Math.PI*radius*radius;
        return a;
    }
    static void greeting(String name)
    {
        System.out.println("Hello ");
        System.out.println("Hello " + name);
    }
    static void rectangle(int a, int b)
    {
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                System.out.print("&");
            }
            System.out.println("");
        }
    }

}
