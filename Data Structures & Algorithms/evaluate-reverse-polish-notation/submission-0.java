class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String str: tokens) {
            switch (str) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    Integer a = stack.pop();
                    Integer b = stack.pop();
                    stack.push(b - a);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    Integer d = stack.pop();
                    Integer c = stack.pop();
                    stack.push(c / d);
                    break;
                default:
                    stack.push(Integer.valueOf(str));

            }

        }
        return stack.pop();

        
    }
}
