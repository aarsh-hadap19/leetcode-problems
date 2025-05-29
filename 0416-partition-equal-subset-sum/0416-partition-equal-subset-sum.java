class Solution {
    public boolean canPartition(int[] nums) {
        int total=Arrays.stream(nums).sum();
        if(total%2!=0)return false;

        int target=total/2;
        boolean[] arr=new boolean[target+1];
        arr[0]=true;

        for(int n:nums){
            for(int i=target;i>=n;i--){
                if(arr[i])continue;
                if(arr[i-n])arr[i]=true;
                if(arr[target])return true;
            }
        }
        return false;
    }
}