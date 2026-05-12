class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int n: nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }       

        for(int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] res = new int[k];
        int counter = 0;

        for(int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if(bucket[pos] != null) {
                for(Integer integer: bucket[pos]) {
                    res[counter++] = integer;
                }
            }
        } 
        return res;
    }
}

/**

// Step 1: Frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min heap based on frequency
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Step 3: Keep only top k elements
        for (int key : map.keySet()) {
            heap.offer(key);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Step 4: Build result
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }

        return result;

*/
