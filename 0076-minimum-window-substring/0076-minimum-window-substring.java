class Solution {
    public String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        int[] need = new int[256];

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int right = 0;
        int required = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char r = s.charAt(right);

            // If this character is still needed
            if (need[r] > 0) {
                required--;
            }

            need[r]--;
            right++;

            // Valid window
            while (required == 0) {

                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char l = s.charAt(left);

                need[l]++;

                // Window becomes invalid
                if (need[l] > 0) {
                    required++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}