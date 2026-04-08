import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Step 1: Frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Min Heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );
        
        // Step 3: Keep only k elements
        for(int key : map.keySet()){
            pq.add(key);
            
            if(pq.size() > k){
                pq.poll(); // remove least frequent
            }
        }
        
        // Step 4: Build result
        int[] result = new int[k];
        int i = 0;
        
        while(!pq.isEmpty()){
            result[i++] = pq.poll();
        }
        
        return result;
    }
}