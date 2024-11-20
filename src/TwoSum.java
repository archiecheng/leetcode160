import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int[] nums = {3, 2, 4};
        int[] nums = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0;;i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] +  nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
    }
}
