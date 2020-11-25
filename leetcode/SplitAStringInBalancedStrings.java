package leetcode;

/**
 * SplitAStringInBalancedStrings.
 *
 * @author Ibodulla Ibodullaev
 * @since 25.11.2020
 */
public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int L = 0, R = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R'){
                R++;
            } else {
                L++;
            }
            if(R == L){
                count++;
            }
        }
        return count;
    }
}