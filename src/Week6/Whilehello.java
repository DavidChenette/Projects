package Week6;

/**
 * Created by David Chenette on 2/17/2016.
 */
public class Whilehello {
    public static void main(String[] args) {
        int square = 1;
        int count = 1;
        while (count <= 20)
        {
            System.out.printf("%d\t\thello\t\t%d\n", count, square);
            count++;
            square = count * count;

        }
    }
}


