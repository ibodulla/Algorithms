import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bb;
       for (int i = 0; i < n; i++){
            bb = sc.nextInt();
            if(bb == 1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}