package leetcode;

/**
 * XOROperationInAnArray.
 *
 * @author Ibodulla Ibodullaev
 * @since 25.11.2020
 */
public class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        int bitwise = 0;
        for(int i = 0; i < n; i++) {
            start ^=  start + 2 * i;
        }
        return bitwise;
    }
}