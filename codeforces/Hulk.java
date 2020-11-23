import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1){
                System.out.print("I hate");
            }else
                if(i % 2 == 1 && i != 1){
                System.out.print(" that I hate");
                }else{
                System.out.print(" that I love");
                }
        }
        System.out.println(" it");
    }
}