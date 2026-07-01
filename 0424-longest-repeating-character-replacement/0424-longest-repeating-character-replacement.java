class Solution {
    
    public int find(HashMap<Character, Integer> freq) {
        int maxCount = -1;

        for (int count : freq.values()) {
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public int characterReplacement(String s, int k) {

        int n = s.length();
        int l=0,res=0, len;
       HashMap<Character, Integer> freq = new HashMap<>();

        for(int h=0; h<n; h++){
            len = h-l+1;
            char c = s.charAt(h);

            freq.put(c , freq.getOrDefault(c,0)+1);
            int maxcount = find(freq);
            int dif = len - maxcount;

            while(dif > k){
                char leftchar = s.charAt(l);
                freq.put(leftchar , freq.get(leftchar)-1);

                if (freq.get(leftchar) == 0) {
                    freq.remove(leftchar);
                }
                l++;

                len = h-l+1;
                maxcount = find(freq);
                dif = len-maxcount;
            }
            res = Math.max(res , h-l+1);
        }

        

        return res;
        
    }
}