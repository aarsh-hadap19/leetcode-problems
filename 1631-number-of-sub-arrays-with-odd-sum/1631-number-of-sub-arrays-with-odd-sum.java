class Solution {
    public int numOfSubarrays(int[] nums) {
        final int mod=1_000_000_007;
        int count=0,prefixSum=0;
        int oddc=0,evenc=1;
        for(int num:nums){
            prefixSum+=num;
            if(prefixSum%2==0){
                count+=oddc;
                evenc++;
            }
            else{
                count+=evenc;
                oddc++;
            }
            count%=mod;
        }
        return count;
    }
}