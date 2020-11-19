package leetcode;

/**
 * HowManyNumbersAreSmallerThanTheCurrentNumber.
 *
 * @author Ibodulla Ibodullaev
 * @since 18.11.2020
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];

        for(int n : nums) {
            ++counts[n];
        }

        int sum = 0;
        for(int i = 0; i < counts.length; i++) {
            int temp = counts[i];
            counts[i] = sum;
            sum += temp;
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = counts[nums[i]];
        }
        return nums;
    }
}