import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = getCount(i);
        }
        return ans;
    }

    public static int getCount(int n){
        int number = 0;
        for (int i = 0; i < 32; i++){
            number += (n >> i) & 1;
        }
        return number;
    }
}
