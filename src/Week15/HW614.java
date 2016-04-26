package Week15;

/**
 * Created by David Chenette on 4/25/2016.
        */
public class HW614 {
    public static void main(String[] args) {
        int num = addData(2, 9);

        System.out.println(num);
    }
    public static int addData(int ... par1) {
        int total = 1;

        for (int j = 0; j < par1.length; j++) {
            total *= par1[j];
        }
        return total;
    }
}
