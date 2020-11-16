package hackerrank.arrays;


import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class NewYearChaos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            int switchPosCnt = 0;
            boolean chaotic = false;
            for (int i = a.length - 1; i >= 0; i--) {
                    if (a[i] - (i) > 2) {
                        chaotic = true;
                        break;
                    }
                for (int j = Math.max(0, a[i] - 2); j < i; j++)
                    if (a[j ] > a[i]) switchPosCnt++;
            }
            System.out.println(chaotic ? "Too chaotic" : switchPosCnt);
        }
    }
}