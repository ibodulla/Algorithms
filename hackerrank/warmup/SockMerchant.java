package algorithms.hackerrank.warmup;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Ibodulla Ibodullaev created on 2/15/2020 inside the package - PACKAGE_NAME
 */
public class SockMerchant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int socks = 0;
        Set<Integer> setColor = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (setColor.contains(a[i])) {
                socks++;
                setColor.remove(a[i]);
            } else {
                setColor.add(a[i]);
            }
        }
        System.out.println(socks);
    }
}