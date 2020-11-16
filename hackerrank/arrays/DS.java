package hackerrank.arrays;

import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class DS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int sum = 0;
                sum += a[i][j] + a[i - 1][j] + a[i - 1][j - 1] + a[i - 1][j + 1] +
                        a[i + 1][j] + a[i + 1][j + 1] + a[i + 1][j - 1];
                if (max < sum)
                    max = sum;
            }
        }
        System.out.println(max);
    }
}