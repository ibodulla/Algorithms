import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ibodulla Ibodullaev created on 2/6/2020 inside the package - PACKAGE_NAME
 */
public class Cards1220A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 0, z = 0, e = 0, r = 0, o = 0;
        String s = sc.next();

        for(int i = 0; i < num; i++){
            if(s.charAt(i) == 'n'){
                n++;
            }
            if(s.charAt(i) == 'z'){
                z++;
            }
            if(s.charAt(i) == 'e'){
                e++;
            }
            if(s.charAt(i) == 'r'){
                r++;
            }
            if(s.charAt(i) == 'o'){
                o++;
            }
        }
        int minOne = Math.min(Math.min(o,n),e);
        e = e - minOne;
        o = o - minOne;
        int minZero = Math.min(Math.min(Math.min(z,e),r),o);
        for (int i = 0; i < minOne; i++){
            System.out.print(1 + " ");
        }
        for (int i = 0; i < minZero; i++){
            System.out.print(0 + " ");
        }
    }
}