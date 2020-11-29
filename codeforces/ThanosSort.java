import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class ThanosSort {
    static int[] a;
    static int func(int l,int r){
        if(isSorted(a, l, r)) return r - l + 1;
        int mid = l + r >> 1;
        System.out.println(mid);
        return Math.max(func(l,mid),func(mid + 1,r));
    }
    static boolean isSorted(int[] array, int l, int r) {
        for (int i = l; i < r ; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}