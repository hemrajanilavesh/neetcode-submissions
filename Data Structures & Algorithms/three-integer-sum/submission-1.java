class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // O (n log n)

        // O (n square)
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int leftPtr = i+1; int rightPtr = nums.length-1;
            while (leftPtr < rightPtr) {
                int sum = nums[i] + nums[leftPtr] + nums[rightPtr];
                if (sum > 0) {
                    rightPtr--;
                } else if (sum < 0) {
                    leftPtr++;
                } else {
                    // sum == 0
                    result.add(Arrays.asList(nums[i] ,nums[leftPtr] ,nums[rightPtr]));
                    leftPtr += 1;
                    while (leftPtr < rightPtr && nums[leftPtr] == nums[leftPtr-1]) {
                        leftPtr += 1;
                    }
                }
            }
        }
        return result;
        
    }
}
