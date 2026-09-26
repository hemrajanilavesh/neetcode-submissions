class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        // Calculate prefix
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for (int i = nums.length-1; i >=0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
        
    }
}  
