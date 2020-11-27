package leetcode;

/**
 * FindNumbersWithEvenNumberOfDigits.
 *
 * @author Ibodulla Ibodullaev
 * @since 27.11.2020
 */
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            int digits = 1;
            while(nums[i]>=10){
                digits++;
                nums[i] = nums[i] / 10;
            }
            if(digits % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}