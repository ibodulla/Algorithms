package algorithms.hackerrank.warmup;

import java.util.Scanner;

/**
 * Ibodulla Ibodullaev created on 2/18/2020 inside the package - PACKAGE_NAME
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        int i = 0;
        while (i < a.length - 1) {
            cnt++;
            i = index(a, i);
        }
        System.out.println(cnt);


    }

    public static int index(int[] a, int curIndex) {
        int index = a.length - 1;
        int step = 2;
        while (step > 0) {
            if (a.length - 1 < step + curIndex) {
                step--;
            }
            if (a[curIndex + step] == 0) {
                return curIndex + step;
            }
            step--;
        }
        return index;
    }
}