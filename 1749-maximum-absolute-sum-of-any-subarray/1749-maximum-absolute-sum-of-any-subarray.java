class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxsub=nums[0];
        int minsub = nums[0];
        int res=Math.abs(nums[0]);

        for(int i=1;i<nums.length;i++){
            maxsub=Math.max(maxsub+nums[i],nums[i]);
            minsub=Math.min(minsub+nums[i],nums[i]);
            res=Math.max(res,Math.max(Math.abs(maxsub),Math.abs(minsub)));
        }

        return res;
        
    }
}