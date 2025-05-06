class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int totalGas=0;
        int curr=0;
        for(int i=0;i<gas.length;i++){
            int fuelGain=gas[i]-cost[i];
            totalGas+=fuelGain;
            curr+=fuelGain;
            if(curr<0){
                curr=0;
                start=i+1;
            }
        }
        return totalGas<0 ? -1 : start;
    }
}