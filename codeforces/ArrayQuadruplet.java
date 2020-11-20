import java.util.Arrays;

/**
 * Created by Ibodulla
 */
public class ArrayQuadruplet {
    static int[] findArrayQuadruplet(int[] arr, int s){
        if(arr == null || arr.length < 4){
            return arr;
        }
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int r = s - arr[i] - arr[j];
                int k = j + 1;
                int l = n - 1;
                while(k < l){
                    if(r < (arr[k] + arr[l])){
                        l--;
                    } else if(r > (arr[k] + arr[l])){
                        k++;
                    } else{
                        int[] ret = {arr[i], arr[j], arr[k], arr[l]};
                        return ret;
                    }
                }
            }
        }
        return arr;
    }

}
