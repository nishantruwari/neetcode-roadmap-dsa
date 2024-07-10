class Solution {
    public int countMostFreq(HashMap<Character, Integer> map) {
        int max = 0;
      
        for (int i : map.values())
            max = (i > max ? i : max);
        
        return max;
    }

    public int characterReplacement(String s, int k) {
        int windowsize = 0, l, r, max = 0, replace;
        HashMap<Character, Integer> map = new HashMap<>();
        for (l = 0, r = 0; r < s.length(); r++) {
            if (map.containsKey(s.charAt(r))) {
                map.put(s.charAt(r), map.get(s.charAt(r)) + 1);
            } else {
                map.put(s.charAt(r), 1);
            }
            windowsize = r - l + 1;
            replace = windowsize - countMostFreq(map);

            while (replace > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                ++l;
                windowsize = r - l + 1;
                replace = windowsize - countMostFreq(map);

            }
            windowsize = r - l + 1;
            max = windowsize > max ? windowsize : max;

        }
        return max;

    }
}