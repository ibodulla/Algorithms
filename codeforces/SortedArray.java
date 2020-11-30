import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class SortedArray {
    public static boolean solution(int[] arr){
        int I = -1, J = -1;
        for (int i = 0; i < arr.length -1; i++){
            if(I == -1 && arr[i] > arr[i + 1]){
                I = i;
            }
            if(I != -1 && arr[I] <= arr[i + 1]){
                J = i;
            }
        }
        if(J == -1)
            J = arr.length - 1;
        if(I == -1)
            return true;
        else{
            int a = arr[J];
            arr[J] = arr[I];
            arr[I] = a;
        }

        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

}