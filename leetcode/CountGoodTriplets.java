package leetcode;

/**
 * CountGoodTriplets.
 *
 * @author Ibodulla Ibodullaev
 * @since 26.11.2020
 */
public class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int tripletCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) <= a){
                    for (int k = j+1; k < arr.length; k++) {
                        if(Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c){
                            tripletCount++;
                        }
                    }
                }
            }
        }
        return tripletCount;
    }
}