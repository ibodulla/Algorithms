package leatcode;

import java.util.HashMap;
import java.util.Set;

/**
 * NumberOfGoodPairs.
 *
 * @author Ibodulla Ibodullaev
 * @since 16.11.2020
 */
public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        if (nums.length < 2) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                int tempCnt = map.get(i);
                map.put(i, ++tempCnt);
            } else {
                map.put(i, 1);
            }
        }
        int goodPairs = 0;
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            int temp = map.get(key);
            if (temp > 1) {
                goodPairs += temp * (temp - 1) / 2;
            }
        }
        return goodPairs;
    }
}
