class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int curr = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (st.contains(s.charAt(i))) {
                for (int j = curr; j < i; j++) {

                    if (s.charAt(j) == s.charAt(i)) {
                        curr = j + 1;
                        break;
                    }
                    st.remove(s.charAt(j));
                }
            } else {
                st.add(s.charAt(i));
            }
            max = st.size() > max ? st.size() : max;

        }
        return max;
    }
}