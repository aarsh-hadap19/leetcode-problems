class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]ans=new int[nums.length];
        int prod=1;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            else{
                prod*=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(z>1){
                ans[i]=0;
            }
            else if(z==1){
                ans[i]=(nums[i]==0)?prod:0;
            }
            else{
                ans[i]=prod/nums[i];
            }
        }
        return ans;
    }
}