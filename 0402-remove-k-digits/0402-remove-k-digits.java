class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder st = new StringBuilder();

        for (char c : num.toCharArray()) {
            while (k > 0 && st.length() > 0 && st.charAt(st.length() - 1) > c) {
                st.deleteCharAt(st.length() - 1);
                k--;
            }
            st.append(c);
        }

        // remove remaining k digits from end
        while (k > 0 && st.length() > 0) {
            st.deleteCharAt(st.length() - 1);
            k--;
        }

        // remove leading zeros
        int i = 0;
        while (i < st.length() && st.charAt(i) == '0') {
            i++;
        }

        String result = st.substring(i);

        return result.length() == 0 ? "0" : result;
    }
}