class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0,sum2=0,z1=0,z2=0;
        for(int num:nums1){
            if(num==0){
                sum1++;
                z1++;
            }
            sum1+=num;
        }
        for(int num:nums2){
            if(num==0){
                sum2++;
                z2++;
            }
            sum2+=num;
        }
        if((z1==0 && sum2>sum1)||(z2==0 && sum1>sum2)){
            return -1;
        }
        return Math.max(sum1,sum2);
    }
}