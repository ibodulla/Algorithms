import static java.lang.Math.max;

/**
 * Created by Ibodulla
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int n = 8;
        int[] array = {-1, 2, 4, -3, 5, 2, -5, 4};
//        10 -5 5 13
        int best = 0, sum = 0;
        for (int k = 0; k < n; k++) {
            sum = max(array[k],sum+array[k]);
            System.out.println((array[k]));
            best = max(best,sum);
            System.out.println(best);
        }
        System.out.println(best);
    }
}
