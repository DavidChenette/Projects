package Week10;

/**
 * Created by David Chenette on 3/23/2016.
 */
public class HW421 {
    public static void main(String[] args) {
        for (int a = 1; a <= 500; a++)
        {
            for (int b = 1; b <= 500; b++)
            {
                for (int c = 1; c <= 500; c++)
                {
                    if (a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a)
                    {
                        if (a < b) {
                            if (b < c) {
                                System.out.printf("%d ", a);
                                System.out.printf("%d ", b);
                                System.out.printf("%d ", c);
                                System.out.println("");
                            }
                        }
                    }
                }
            }
        }
    }
}