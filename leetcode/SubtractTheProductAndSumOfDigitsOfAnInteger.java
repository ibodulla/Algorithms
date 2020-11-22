package leetcode;

/**
 * SubtractTheProductAndSumOfDigitsOfAnInteger.
 *
 * @author Ibodulla Ibodullaev
 * @since 22.11.2020
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        if(n < 10)
            return 0;
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            sum += n % 10;
            prod *= n % 10;
            n = n / 10;
        }
        return prod - sum;
    }
}