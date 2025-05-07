class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        combinations(1,k,n,ans,new ArrayList<>());
        return ans;
    }
    public void combinations(int ind,int k,int target,List<List<Integer>>ans,List<Integer>curr){
        if(k==0&&target==0){
            ans.add(new ArrayList<>(curr));
        }
        for(int i=ind;i<=9;i++){
            if(i>target)break;
            curr.add(i);
            combinations(i+1,k-1,target-i,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}