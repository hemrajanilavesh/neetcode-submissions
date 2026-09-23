class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (Character character: s.toCharArray()) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        for (Character character: t.toCharArray()) {
            if (!frequencyMap.containsKey(character)) {
                return false;
            }
            frequencyMap.computeIfPresent(character, (k, count) -> count - 1);
        }
        return frequencyMap.values().stream().noneMatch(value -> value != 0);

    }
}
