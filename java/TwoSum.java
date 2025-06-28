// Two Sum - https://leetcode.com/problems/two-sum/
// Diberikan array integer nums dan integer target, kembalikan indeks dua angka yang jika dijumlahkan hasilnya target.
import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (lookup.containsKey(complement)) {
                return new int[] {lookup.get(complement), i};
            }
            lookup.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
} 