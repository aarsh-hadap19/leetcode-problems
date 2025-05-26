class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>>list=new ArrayList<>();
        boolean[]prime=new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<prime.length;i++){
            if(prime[i]){
                for(int j=i*2;j<prime.length;j=j+i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=n/2;i++){
            int t=n-i;
            if(prime[i]&&prime[t]){
                List<Integer>arr=new ArrayList<>();
                arr.add(i);
                arr.add(t);
                list.add(arr);
            }
        }
        return list;
    }
}