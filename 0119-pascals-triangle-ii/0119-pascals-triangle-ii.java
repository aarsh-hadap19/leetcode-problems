class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> result = new ArrayList<>();
        long ans=1;
        result.add((int)ans);
        for(int i=0;i<n;i++){
            ans = ans*(n-i);
            ans = ans/(i+1);
            // ans = Int(ans);
            result.add((int)ans);
        }
        return result;
    }
}