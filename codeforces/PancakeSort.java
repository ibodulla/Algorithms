import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ibodulla
 */
public class PancakeSort {

    static void flip(int[] arr, int k) {
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < (k) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[k - 1 - i];
            arr[k - 1 - i] = temp;
        }
    }

    static int[] pancakeSort(int[] arr){
        if(arr == null || arr.length < 2){
            return arr;
        }

        for (int i = arr.length - 1; i >= 0; i--){
            int maxElementIdex = i;
            for(int j = i; j >= 0; j--){
                if(arr[maxElementIdex]< arr[j]){
                    maxElementIdex = j;
                }
            }
            flip(arr, maxElementIdex + 1);
            flip(arr, i + 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 2};
        int[] a = pancakeSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Set<Integer> set = new TreeSet<>();
        set.add(7);
        set.add(5);
        set.add(5);
        set.add(4);
        set.add(2);
        Object[] aa = set.toArray();
        System.out.println(set.size());
        System.out.println(set.toArray()[3]);
    }
}
