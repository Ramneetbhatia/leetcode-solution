import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: process nums2
        for (int num : nums2) {
            
            // if current num is greater than stack top
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            
            stack.push(num);
        }
        
        // Step 2: remaining elements → no next greater
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        
        // Step 3: build answer for nums1
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }
}