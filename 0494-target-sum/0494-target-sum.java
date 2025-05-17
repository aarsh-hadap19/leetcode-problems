class Solution {
    int totalWays=0;
    public int findTargetSumWays(int[] nums, int target) {
        calculateWays(nums,0,0,target);
        return totalWays;
    }
    private void calculateWays(int[] nums,int currInd,int currSum,int target){
        if(currInd==nums.length){
            if(currSum==target){
                totalWays++;
            }
        }
        else{
            calculateWays(nums,currInd+1,currSum+nums[currInd],target);
            calculateWays(nums,currInd+1,currSum-nums[currInd],target);
        }
    }
}