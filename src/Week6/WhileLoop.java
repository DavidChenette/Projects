package Week6;

/**
 * Created by David Chenette on 2/17/2016.
 */
public class WhileLoop {
    public static void main(String[] args) {

        int count = 2;
        while (count <= 99999)
        {
            System.out.printf("%d\n", count);
            count = count * count;

        }
    }
}
