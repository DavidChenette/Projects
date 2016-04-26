package Week6;

/**
 * Created by David Chenette on 2/17/2016.
 */
public class TabularOutput {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c = 1;

        System.out.printf("N\t\t10*N\t100*N\t1000*N\n\n");

        while (a <4)
        {
            System.out.printf("%d\t\t",c);
            c=b *10;
            b = c;
            a++;
        }
        System.out.print("\n");
        a=0;
        b=2;
        c=2;
        while (a <4)
        {
            System.out.printf("%d\t\t",c);
            c=b *10;
            b = c;
            a++;
        }
        System.out.print("\n");
        a=0;
        b=3;
        c=3;
        while (a <4)
        {
            System.out.printf("%d\t\t",c);
            c=b *10;
            b = c;
            a++;
        }
        System.out.print("\n");
        a=0;
        b=4;
        c=4;
        while (a <4)
        {
            System.out.printf("%d\t\t",c);
            c=b *10;
            b = c;
            a++;
        }
        System.out.print("\n");
        a=0;
        b=5;
        c=5;
        while (a <4)
        {
            System.out.printf("%d\t\t",c);
            c=b *10;
            b = c;
            a++;
        }
    }
}