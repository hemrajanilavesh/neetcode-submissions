class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder encoded = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str: strs) {
            sizes.add(str.length());
        }
        for (Integer size: sizes) {
            encoded.append(size).append(",");
        }
        encoded.append("#");
        for (String str: strs) {
            encoded.append(str);
        }
        return encoded.toString();

    }

    public List<String> decode(String str) {
        if (str.isEmpty()) return new ArrayList<>();

        int i = 0;
        List<Integer> sizes = new ArrayList<>();
        while (str.charAt(i) != '#') {
            StringBuilder currentSize = new StringBuilder();
            while (str.charAt(i) != ',') {
                currentSize.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.decode(currentSize.toString()));
            i++;
        }
        System.out.println(sizes);
        System.out.println(i);
        List<String> strs = new ArrayList<>(sizes.size());
        for (Integer size: sizes) {
            StringBuilder currentStr = new StringBuilder();
            currentStr.append(str.substring(i+1, i + 1 + size));
            strs.add(currentStr.toString());
            i = i + size;
        }

        return strs;

    }
}
