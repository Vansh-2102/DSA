class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int l=0,h=0,sum=0;
        int res = Integer.MAX_VALUE;   

        while(h<nums.length){
            sum+=nums[h];
            while(sum>= target){
                int len = h-l+1;
                res = Math.min(res,len);
                sum-=nums[l];
                l++;
            }
            h++;
        }

         return (res == Integer.MAX_VALUE) ? 0 : res;
        
    }
}