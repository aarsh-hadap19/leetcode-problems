class Solution {
    public boolean isPerfectSquare(int num) {
        double sq = Math.sqrt(num);
        if(sq==(int)sq){
            return true;
        }
        else{
            return false;
        }
    }
}