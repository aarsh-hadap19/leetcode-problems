class Solution {
    public int[] constructDistancedSequence(int n) {
        int[]ans=new int[n*2-1];
        boolean[] used=new boolean[n+1];
        backtrack(0,ans,used,n);
        return ans;
    }
    private boolean backtrack(int index,int[]ans,boolean[]used,int n){
        if(index==ans.length)return true;
        if(ans[index]!=0)return backtrack(index+1,ans,used,n);
        else{
            for(int i=n;i>=1;i--){
                if(used[i])continue;
                used[i]=true;
                ans[index]=i;
                if(i==1){
                    if(backtrack(index+1,ans,used,n))return true;
                }
                else if(index+i<ans.length && ans[index+i]==0){
                    ans[i+index]=i;
                    if(backtrack(index+1,ans,used,n))return true;
                    ans[index+i]=0;
                }
                ans[index]=0;
                used[i]=false;
            }
        }
        return false;
    }
}