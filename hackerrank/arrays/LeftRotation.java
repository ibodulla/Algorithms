package hackerrank.arrays;

/**
 * Ibodulla Ibodullaev
 */
public class LeftRotation {
    public static void main(String[] args) {
        int[] a = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        int d = 10;
        if (d == 1 || d == a.length - 1) {
//            return a;
        }
        int k = 0;
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if(i < d){
                b[a.length - d + i] = a[i];
            }else{
                b[k++] = a[i];
            }

        }
        for (int i = 0; i < a.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}