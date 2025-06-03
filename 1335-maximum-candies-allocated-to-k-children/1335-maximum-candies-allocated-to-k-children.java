class Solution {
    public int maximumCandies(int[] candies, long k) {
        int maxc=0;
        for(int candy:candies){
            maxc=Math.max(candy,maxc);
        }
        int right=maxc;
        int left=0;
        while(left<right){
            int middle=(left+right+1)/2;
            if(canAllocate(middle,candies,k)){
            left=middle;
            }
            else{
                right=middle-1;
            }
        }
        return left;
    }
    private boolean canAllocate(int n,int[]candies,long k){
        long max=0;
        for(int i=0;i<candies.length;i++){
            max+=candies[i]/n;
        }
        return max>=k;
    }   
}