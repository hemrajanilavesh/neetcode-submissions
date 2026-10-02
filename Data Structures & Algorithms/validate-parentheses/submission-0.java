class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> closeToOpenMap = new HashMap<>();
        closeToOpenMap.put('}','{');
        closeToOpenMap.put(')','(');
        closeToOpenMap.put(']','[');
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (Character character: s.toCharArray()) {
            if (!closeToOpenMap.containsKey(character)) {
                // character is open bracket
                stack.push(character);
            } else {
                if (!stack.isEmpty() && stack.peek() == closeToOpenMap.get(character)) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }

        return stack.isEmpty();
        
    }
}
