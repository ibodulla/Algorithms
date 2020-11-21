import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class Replacment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxEl = Integer.MIN_VALUE;
        int j = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > maxEl){
                maxEl = arr[i];
                j = i;
            }
        }
        if(maxEl == 1)
            arr[j] = 2;
        else
            arr[j] = 1;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}