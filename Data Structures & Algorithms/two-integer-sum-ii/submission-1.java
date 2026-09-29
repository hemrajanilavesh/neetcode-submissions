class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPtr = 0;
        int rightPtr = numbers.length - 1;
        while (leftPtr < rightPtr) {
            int sum = numbers[leftPtr] + numbers[rightPtr];
            if (sum == target) {
                return new int[] {++leftPtr, ++rightPtr};
            } else if (sum > target) {
                rightPtr--;
            } else {
                leftPtr++;
            }
        }
        return new int[]{-1, -1};
    
    }
}
