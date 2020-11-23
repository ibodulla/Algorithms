package leetcode;

/**
 * CreateTargetArrayInTheGivenOrder.
 *
 * @author Ibodulla Ibodullaev
 * @since 24.11.2020
 */
public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(index[i] < i){
                for(int j = i; j >=index[i]; i--){
                    target[j] = target[j-1];
                }
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}