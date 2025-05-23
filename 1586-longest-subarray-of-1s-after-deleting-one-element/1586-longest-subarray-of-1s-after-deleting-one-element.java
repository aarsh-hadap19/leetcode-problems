class Solution {
    public int longestSubarray(int[] nums) {
        int zerocount=0,sum=0,start=0;
        for(int i=0;i<nums.length;i++){
            zerocount+=(nums[i]==0?1:0);
            while(zerocount>1){
                zerocount-=(nums[start]==0?1:0);
                start++;
            }
            sum=Math.max(sum,i-start);
        }
        return sum;
    }
}