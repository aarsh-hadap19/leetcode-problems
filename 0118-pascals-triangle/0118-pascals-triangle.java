class Solution {
    public List<Integer> generateRow(int n) {
        long ans=1;
        List<Integer> rowAns = new ArrayList<>();
        rowAns.add((int)ans);
        for(int i=0;i<n;i++){
            ans = ans*(n-i);
            ans = ans/(i+1);
            // ans = Int(ans);
            rowAns.add((int)ans);
        }
        return rowAns;
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            result.add(generateRow(i));
        }
        return result;
    }
}