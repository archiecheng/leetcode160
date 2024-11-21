import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
//        int[] nums = {3, 0, 1};
        int[] nums = {0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i){
                return i;
            }
        }
        return n;
    }
}
