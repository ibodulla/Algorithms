package leetcode;

/**
 * ToLowerCase.
 *
 * @author Ibodulla Ibodullaev
 * @since 27.11.2020
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(65 <= chars[i] && chars[i] <= 90){
                chars[i] += 32;
            }
        }
        return String.valueOf(chars);
    }
}