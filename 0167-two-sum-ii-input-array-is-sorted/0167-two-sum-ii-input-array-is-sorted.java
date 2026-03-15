class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;

        while(i<j){
            int sum= numbers[i]+numbers[j];
            if(sum==target){
                return new int[] {i+1,j+1}; // because leetcode understant 1 based indexing
            }else if(sum> target){
                j--;
            }else if (sum< target){
                    i++;
            }
    }
    return new int[] {};
    }
}
