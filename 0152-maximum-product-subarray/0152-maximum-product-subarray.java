class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int pre=1,suf=1;
        int ans=arr[0];
        for(int i=0;i<n;i++){
            if(pre==0)pre=1;
            if(suf==0)suf=1;
            pre*=arr[i];
            suf*=arr[n-i-1];
            ans=Math.max(ans,Math.max(pre,suf));
        }
        return ans;
    }
}