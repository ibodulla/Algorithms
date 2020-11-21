import java.util.Scanner;

/**
 * Created by Ibodulla
 */
public class QAQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] charArr = text.toCharArray();
        int q = 0, qa = 0, qaq = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'A')
                qa += q;
            if (charArr[i] == 'Q') {
                q++;
                qaq += qa;
            }
        }
        System.out.println(qaq);
    }
}
