package leetcode;

/**
 * ShuffleString.
 *
 * @author Ibodulla Ibodullaev
 * @since 22.11.2020
 */
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[indices[i]] = s.charAt(i);
        }

        return String.valueOf(chars);
    }
}