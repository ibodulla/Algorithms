import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int[] a = new int[friends + 1];
        for(int i = 1; i <= friends; i++){
            int p = sc.nextInt();
            a[p] = i;
        }
        for(int i = 1; i <= friends; i++){
            System.out.print(a[i] + " ");
        }
    }
}