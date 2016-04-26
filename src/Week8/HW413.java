package Week8;

/**
 * Created by David Chenette on 3/15/2016.
 */
public class HW413 {
    public static void main(String[] args) {

        long factorial = 1;
        int i;
        int j;

        for (j = 1; j <= 20; j++){
            factorial = 1;
            for (i=1; i <= j; i++ ){
                factorial=factorial * i;
            }
            System.out.printf("%d\f\n", factorial);
        }
    }
}
