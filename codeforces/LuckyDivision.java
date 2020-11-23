import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 4 == 0 || n % 7 == 0 || n % 47 ==0) {
            System.out.println("YES");
            return;
        }

        while(n >= 1){
            if(n % 10 != 4 && n % 10 != 7){
                System.out.println("NO");
                return;
            }
            n = n / 10;
        }
        System.out.println("YES");
    }
}