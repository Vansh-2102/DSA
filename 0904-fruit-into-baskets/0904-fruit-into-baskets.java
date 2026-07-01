class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;
        int l=0 , res=-1;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int h=0; h<n; h++){
            int c = fruits[h];
            freq.put(c, freq.getOrDefault(c,0)+1);

             while (freq.size() > 2) {
                int leftc = fruits[l];
                freq.put(leftc, freq.get(leftc) - 1);
                if (freq.get(leftc) == 0)
                    freq.remove(leftc);
                l++;
            }

            res = Math.max(res, h-l + 1);

        }

        return res;
        
    }
}