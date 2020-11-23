import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[ i+1]){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}