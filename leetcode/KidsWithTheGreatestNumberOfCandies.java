package leatcode;

import java.util.ArrayList;
import java.util.List;

/**
 * KidsWithTheGreatestNumberOfCandies.
 *
 * @author Ibodulla Ibodullaev
 * @since 21.10.2020
 */
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        for (int i : candies) {
            if (extraCandies + i >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}