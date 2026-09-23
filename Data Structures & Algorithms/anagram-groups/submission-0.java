class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
            return List.of(List.of(strs[0]));
        }

        Map<String,List<String>> sortedToOriginalMap = new HashMap<>();
        for (String string: strs) {
            char[] stringCharArray = string.toCharArray();
            Arrays.sort(stringCharArray);
            sortedToOriginalMap.
                    computeIfAbsent(Arrays.toString(stringCharArray), k -> new ArrayList<>()).add(string);
        }
        return sortedToOriginalMap.values().stream().toList();
        
    }
}
