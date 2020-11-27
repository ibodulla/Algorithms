package leetcode;

/**
 * MinimumTimeVisitingAllPoints.
 *
 * @author Ibodulla Ibodullaev
 * @since 27.11.2020
 */
public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int minDis = 0;
        for (int i = 1; i < points.length; i++) {
            int xDis = Math.abs(points[i-1][0] - points[i][0]);
            int yDis = Math.abs(points[i-1][1] - points[i][1]);
            minDis += Math.max(xDis, yDis);
        }
        return minDis;
    }
}