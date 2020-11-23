package leetcode;

/**
 * DecompressRunLengthEncodedList.
 *
 * @author Ibodulla Ibodullaev
 * @since 23.11.2020
 */
public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i = 0; i < nums.length; i += 2)
        {
            len+=nums[i];
        }
        int array[] = new int[len];
        int index = 0;
        for(int i = 0; i < nums.length; i = i + 2) {
            for(int j = 0; j < nums[i]; j++) {
                array[index++] = nums[i + 1];
            }
        }
        return array;
    }
}