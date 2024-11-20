import java.util.HashSet;

public class ContainDuplicate {
    /**
     * 217. Contains Duplicate
     * Easy
     * Topics
     * Companies
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,1]
     * <p>
     * Output: true
     * <p>
     * Explanation:
     * <p>
     * The element 1 occurs at the indices 0 and 3.
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [1,2,3,4]
     * <p>
     * Output: false
     * <p>
     * Explanation:
     * <p>
     * All elements are distinct.
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * <p>
     * Output: true
     *
     * @param args
     */
    public static void main(String[] args) {
        // int[] nums = {1, 2, 3, 1};
         // int[] nums = {1, 2,3, 4};
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
