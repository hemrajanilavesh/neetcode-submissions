class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }

        int longest = 0;
        for (int num: nums) {
            if (!numSet.contains(num-1)) {
                int length = 0;
                while (numSet.contains(num + length)) {
                    length += 1;
                }
                if (length > longest) {
                    longest = length;
                }
            }
        }

        return longest;
        
    }
}
