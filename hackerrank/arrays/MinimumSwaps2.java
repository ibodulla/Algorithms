package hackerrank.arrays;

/**
 * Ibodulla Ibodullaev
 */
public class MinimumSwaps2 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        System.out.println(minimumSwaps(arr));
        arr = new int[]{ 4, 3 ,1 , 2};
        System.out.println(minimumSwaps(arr));
        arr = new int[]{ 1, 3, 5, 2, 4, 6, 7};
        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            while (arr[i] != i + 1) {
                int t = arr[i];
                arr[i] = arr[t - 1];
                arr[t - 1] = t;
                cnt++;
            }
        }
        return cnt;
    }
}
