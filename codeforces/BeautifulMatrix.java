import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                num = sc.nextInt();
                if(num == 1){
                    System.out.println(Math.abs(3 - j)+ Math.abs(3 - i));
                    return;
                }
            }
        }
    }

}