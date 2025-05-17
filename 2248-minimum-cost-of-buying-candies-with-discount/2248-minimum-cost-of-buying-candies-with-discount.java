class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        Arrays.sort(cost);
        for(int i=0;i<cost.length;i++){
            if(i%3!=cost.length%3) sum+=cost[i];
        }
        return sum;
    }
}