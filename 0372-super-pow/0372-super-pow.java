import java.math.BigInteger;
class Solution {
    public int superPow(int a, int[] b) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<b.length;i++){
            str.append(Integer.toString(b[i]));
        }
        BigInteger exp=new BigInteger(str.toString());
        BigInteger base=BigInteger.valueOf(a);
        BigInteger res=base.modPow(exp,BigInteger.valueOf(1337));
        return res.intValue();
    }
}