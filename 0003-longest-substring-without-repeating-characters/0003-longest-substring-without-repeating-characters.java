class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0 , maxlen=0;
        Map<Character, Integer> freq = new HashMap<>();

        for(int h = 0; h<n; h++){
            char c = s.charAt(h);

            if(freq.containsKey(c)){
                l = Math.max(l , freq.get(c)+1);
            }

            freq.put(c,h);
            maxlen = Math.max(maxlen , h-l+1);
        }

        return maxlen;
    }
}