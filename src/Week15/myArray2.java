package Week15;

/**
 * Created by David Chenette on 4/20/2016.
 */
public class myArray2 {
    public static void main(String[] args) {
        int a = 5;
        int[] b= new int [8];
        callByValue(a);
        System.out.println( " a = " + a);

        callByRef(b);
        System.out.println( " b[1 = " + b[1]);
    }
    static void callByValue (int num)
    {
        num = 100;

    }
    static void callByRef (int [] num)
    {
        num[1] = 99;

    }
}
