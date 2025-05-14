class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int freqCompare = map.get(b) - map.get(a);
            if (freqCompare == 0) {
                return a.compareTo(b); 
            }
            return freqCompare;
        });
        pq.addAll(map.keySet());
        while (k-- > 0 && !pq.isEmpty()) {
            ans.add(pq.poll());
        }
        return ans;
    }
}
