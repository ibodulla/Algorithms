import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int odd = 0;
            int even = 0;
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if(a[j] % 2 == 1){
                    odd++;
                }else{
                    even++;
                }
            }
            even = even >= 1 ? 1 : 0;
            if ( ((odd + even)% 2 == 1 || odd % 2 == 1) && odd >= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}