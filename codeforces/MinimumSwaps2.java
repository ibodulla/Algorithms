import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class MinimumSwaps2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer a[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int swapCntMin = 0;
        int min = a[0];
        int minIndex = 0;
        int cnt = n - 1;
        for (int i = 0; i < n - 1; i++){
            min = a[i];
            for (int j = i; j < n; j++) {
                if (a[j] < min) {
                    minIndex = j;
                    min = a[j];
                }
            }
             if (minIndex != i && i != a[minIndex]) {
                int t = a[minIndex];
                a[minIndex] = a[i];
                a[i] = t;
                swapCntMin++;

            }
        }

        System.out.println(swapCntMin);
    }
}