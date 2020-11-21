import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class VasyaHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            int n = (a - b);
            System.out.print(b + " " + n / 2);
        } else {
            int n = (b - a);
            System.out.println(a + " " + n / 2);
        }


    }
}