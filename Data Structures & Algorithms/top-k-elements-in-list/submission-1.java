class Solution {
    public int[] topKFrequent(int[] nums, int k) {
Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.getValue(), b.getValue())
        );
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (heap.size() < k) {
                heap.offer(entry);
            } else {
                heap.offer(entry);
                heap.poll();
            }
        }
        
        int[] topK = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            topK[i] = heap.poll().getKey();
        }
        
        return topK;
    }
}
