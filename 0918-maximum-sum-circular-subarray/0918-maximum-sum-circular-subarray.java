class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsub = nums[0];
        int minsub = nums[0];
        int sum = nums[0];
        int res = nums[0];
        int res2 = nums[0];

        int n = nums.length;

        for (int i = 1; i < n; i++) {
            maxsub = Math.max(maxsub + nums[i], nums[i]);
            res = Math.max(res, maxsub);
        }

        for (int i = 1; i < n; i++) {
            sum += nums[i];
            minsub = Math.min(minsub + nums[i], nums[i]);
            res2 = Math.min(res2, minsub);
        }
        res2 = sum - res2;
        if (res < 0)
            return res;
            
        return Math.max(res, res2);
    }
}