package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ibodulla
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Set<Integer> setNum = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(setNum.contains(nums[i])){
                setNum.remove(nums);
            } else {
                setNum.add(nums[i]);
            }
        }
        setNum.toArray()[0].toString();
        return setNum.iterator().next();
    }
}
