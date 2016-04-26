package Week10;

/**
 * Created by David Chenette on 3/23/2016.
 */
public class HW420 {
    public static void main(String[] args) {
        double total = 0;
        double z = 0;
        for (int i = 0; i < 200000;++i)
        {
            z = (4.000000000)/((i*2)+1);
            double value = (z)*(Math.pow(-1,i+1));
            total = total + value;
        }
        System.out.printf("%f", -total);

    }
}

