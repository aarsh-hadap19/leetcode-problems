class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y,dis=0;
        while(xor!=0){
            if(xor%2==1)
                dis++;
            xor=xor>>1;
        }
        return dis;
    }
}