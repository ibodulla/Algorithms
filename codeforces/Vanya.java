import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class Vanya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] a = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > h) {
                cnt += divideNum(a[i], h);
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    public static int divideNum(int n, int h) {
        int cnt = 1;
        while (n > h) {
            cnt++;
            n /= 2;
        }
        return cnt;
    }
}