package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework
        ArrayList<List<Integer>> variations = new ArrayList<>();
        helper(nums, 0, variations);
        return variations; // place holder
    }
    public static int[] swap(int[] nums, int index, int otherIndex){
        int hold;
        hold = nums[index];
        nums[index] = nums[otherIndex];
        nums[otherIndex] = hold;
        return nums;
    }
    public static void helper(int[] nums, int index, ArrayList<List<Integer>> variations){
        if(index == nums.length - 1){
            List<Integer> list = new ArrayList<>(nums.length);
            for(int i : nums){
                list.add(Integer.valueOf(nums[i]));
            }
            variations.add(list);
        }else {
            for (int i = index; i < nums.length; i++) {
                swap(nums, index, i);
                helper(nums, index + 1, variations);
                swap(nums, index, i);
            }
        }
    }
}
