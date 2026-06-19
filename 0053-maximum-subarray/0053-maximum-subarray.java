class Solution {
    public int maxSubArray(int[] nums) {
        int currentSUM = nums[0];
        int maxSUM = nums[0];
        for(int i=1; i<nums.length;i++){
            if(currentSUM + nums[i] > nums[i]){
                currentSUM = currentSUM + nums[i];
            }else{
                currentSUM = nums[i];
            }
            if(maxSUM < currentSUM){
                maxSUM = currentSUM;
            }
        }
        return maxSUM;

    }
}