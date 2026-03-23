import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        
        // add current subset to result
        result.add(new ArrayList<>(current));
        
        // explore choices
        for(int i = index; i < nums.length; i++) {
            
            // choose
            current.add(nums[i]);
            
            // explore
            backtrack(i + 1, nums, current, result);
            
            // unchoose (backtrack)
            current.remove(current.size() - 1);
        }
    }
}
