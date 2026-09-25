class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        //nums = [1, 1, 1, 2, 2, 3], k = 2
        //Counts:  {1: 3, 2: 2, 3: 1}
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        //Index (Frequency):  0     1     2     3     4     5     6
        //Buckets:           [ ]   [3]   [2]   [1]   [ ]   [ ]   [ ]
        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry: countMap.entrySet()) {
            Integer number = entry.getKey();
            Integer frequency = entry.getValue();
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(number);
        }
        //Scan backward:
        //- bucket 3: take 1  (collected: 1)
        //- bucket 2: take 2  (collected: 2, target reached!)
        int[] result = new int[k];
        int idx = 0;

        // Traverse from highest possible frequency down to 1
        for (int freq = buckets.length - 1; freq >= 1 && idx < k; freq--) {
            if (buckets[freq] != null) {
                for (int val : buckets[freq]) {
                    result[idx++] = val;
                    if (idx == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
