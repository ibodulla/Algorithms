package leatcode;

/**
 * Created by Ibodulla on 5/23/2020.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        int k = 0;
        while(true){
            while(n > 0){
                k += (n % 10) *(n % 10);
                n = n / 10;
            }
            System.out.println(k);
            if(k == 1){
                return true;
            }
            if(k > 1 && k < 9){
                return false;
            }
            n = k;
            k = 0;
        }
    }
}
