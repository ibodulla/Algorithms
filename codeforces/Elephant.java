import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = 0;
        steps += n / 5;
        n = n % 5;
        steps += n / 4;
        n = n % 4;
        steps += n / 3;
        n = n % 3;
        steps += n / 2;
        n = n % 2;
        steps += n / 1;
        n = n % 1;
        System.out.println(steps);

    }
}