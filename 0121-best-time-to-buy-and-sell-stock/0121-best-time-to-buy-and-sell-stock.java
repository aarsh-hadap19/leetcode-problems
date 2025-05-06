class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int dif=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int temp=prices[i]-min;
                if(temp>dif){
                    dif=temp;
                }
            }
        }
        return dif;
    }
}