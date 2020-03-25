package algorithms.hackerrank.warmup;

import java.util.Scanner;

/**
 * Ibodulla Ibodullaev created on 2/18/2020 inside the package - PACKAGE_NAME
 */
public class RepeatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int aCnt = 0;
        int a;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a')
                aCnt++;
        }
        a = n / str.length();
        aCnt = aCnt * a;
        n = n % str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a')
                aCnt++;
        }
        System.out.println(aCnt);
    }
}