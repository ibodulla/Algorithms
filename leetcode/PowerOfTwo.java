package leetcode;

/**
 * PowerOfTwo.
 *
 * @author Ibodulla Ibodullaev
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        long l = 1;
        while(l < n) {
            l *= 2;
        }

        return l == n;

//        return n>0 && Integer.bitCount(n) == 1;
    }
}