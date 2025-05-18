class Solution {
    public int minimumCardPickup(int[] cards) {
        int ans=Integer.MAX_VALUE;
        Map<Integer, Integer> mp= new HashMap<>();

        for(int i=0; i< cards.length; i++){
            if(!mp.containsKey(cards[i])) mp.put(cards[i], i);
            else{
                if(ans > (i-mp.get(cards[i])+1) ) ans= i-mp.get(cards[i])+1;
                mp.put(cards[i], i);
            }
        }
        if(ans== Integer.MAX_VALUE) return -1;
        return ans;
    }
}