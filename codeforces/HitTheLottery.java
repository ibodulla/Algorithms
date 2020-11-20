import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class HitTheLottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bills = 0;
        if (n / 100 > 0) {
            bills += n / 100;
            n = n % 100;
        }
        if (n / 20 > 0) {
            bills += n / 20;
            n = n % 20;
        }
        if (n / 10 > 0) {
            bills += n / 10;
            n = n % 10;
        }
        if (n / 5 > 0) {
            bills += n / 5;
            n = n % 5;
        }
        if (n / 1 > 0) {
            bills += n / 1;
        }

        System.out.println(bills);
    }
}