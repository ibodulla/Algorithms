package leetcode;

/**
 * MaximumNestingDepthOfTheParentheses.
 *
 * @author Ibodulla Ibodullaev
 * @since 24.11.2020
 */
public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int depth = 0, left = 0, right = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                left++;
            } else if(s.charAt(i) == ')'){
                if(left > right){
                    depth = left - right;
                }
                right++;
            }
        }
        return depth;
    }

}