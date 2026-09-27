class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int leftPtr = 0; int rightPtr = chars.length-1;
        while (leftPtr < rightPtr) {
            while (leftPtr < rightPtr && !alphaNum(chars[leftPtr])){
                leftPtr++;
            }
            while (rightPtr > leftPtr && !alphaNum(chars[rightPtr])) {
                rightPtr--;
            }
            if (Character.toLowerCase(chars[leftPtr]) != Character.toLowerCase(chars[rightPtr])) {
                return false;
            }
            leftPtr++;
            rightPtr--;
        }
        return true;
    }
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
