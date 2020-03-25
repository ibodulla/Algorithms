package algorithms.hackerrank.warmup;

import java.util.Scanner;

/**
 * Ibodulla Ibodullaev created on 2/15/2020 inside the package - PACKAGE_NAME
 */
public class CountingValleys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String path = sc.next();
        int cntVal = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (path.charAt(i) == 'D') {
                if (cnt == 0) {
                    cntVal++;
                }
                cnt--;
            } else {
                cnt++;
            }
        }
        System.out.println(cntVal);
    }
}