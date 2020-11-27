package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * UniqueMorseCodeWords.
 *
 * @author Ibodulla Ibodullaev
 * @since 27.11.2020
 */
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] map = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-",
            "...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String s : words) {
            StringBuilder code = new StringBuilder();

            for(char c : s.toCharArray())
                code.append(map[c - 'a']);

            set.add(code.toString());
        }
        return set.size();
    }
}