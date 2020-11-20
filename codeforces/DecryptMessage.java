/**
 * Created by Ibodulla
 */
public class DecryptMessage {
    static char[] decrypt(String word){
        char[] charArr = word.toCharArray();
        int previous = charArr[0];
        charArr[0] = (char) bringIntoRange(charArr[0] - 1);
        for (int i = 1; i < charArr.length; i++){
            int temp = charArr[i];
            charArr[i] = (char) bringIntoRange(charArr[i] - previous);
            previous = temp;
        }
        return charArr;
    }

    static int bringIntoRange(int n){
        while(n < 99){
            n = n + 26;
        }
        return n;
    }

}
