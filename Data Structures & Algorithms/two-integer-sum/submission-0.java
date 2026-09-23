class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            Integer complement = target - nums[i];
            if (indexMap.containsKey(complement)) {
                Integer compIndex = indexMap.get(complement);
                return new int[] {Math.min(i, compIndex), Math.max(i, compIndex)};
            }
            indexMap.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
