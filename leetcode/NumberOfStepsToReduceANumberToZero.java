package leetcode;

/**
 * NumberOfStepsToReduceANumberToZero.
 *
 * @author Ibodulla Ibodullaev
 * @since 22.11.2020
 */
public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps (int num) {
        int stepsCount = 0;
        while(num > 0) {
            stepsCount++;
            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num--;
            }
        }
        return stepsCount;
    }
}