import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class LoveA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count > s.length() / 2 ? s.length() : count * 2 - 1);
    }

}