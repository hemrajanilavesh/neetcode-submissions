class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];
        Stack<int[]> stack = new Stack<int[]>();
        for(int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while(!stack.isEmpty() && temp > stack.peek()[0]) {
                int[] pair = stack.pop();
                results[pair[1]] = i - pair[1];
            }
            
            stack.push(new int[]{temp, i});
        }

        return results;
    }
}
