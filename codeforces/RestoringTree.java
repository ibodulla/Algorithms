import java.util.Scanner;

/**
 * Ibodulla Ibodullaev
 */
public class RestoringTree {
    public static void main(String[] args) {
        int n = 4;
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int[] arr = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                k = i;
                max = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(k != i)
               System.out.print(max - arr[i] + " ");
        }
    }
}