package leetcode;

/**
 * SumOfAllOddLengthSubarrays.
 *
 * @author Ibodulla Ibodullaev
 * @since 26.11.2020
 */
public class SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0 , N  = arr.length;

        for(int i = 0 ; i < N ; i++){
            int numberOfstartingSubArrays = N - i , numberOfEndingSubArrays = i + 1;
            int totalSubArrays = numberOfstartingSubArrays * numberOfEndingSubArrays;
            int oddSubArrays = totalSubArrays / 2;
            if(totalSubArrays % 2 == 1){
                oddSubArrays++;
            }
            ans += arr[i] * oddSubArrays;
        }

        return ans;
    }
}