class Solution {
    public int maxProduct(int[] nums) {
        int minbestending = nums[0];
        int maxbestending = nums[0];
        int ans=nums[0];
        int n=nums.length;

        for(int i=1; i<n;i++){
            int v1=minbestending*nums[i];
            int v2=maxbestending*nums[i];
            minbestending = Math.min(nums[i], Math.min(v1,v2));
            maxbestending = Math.max(nums[i],Math.max(v1,v2) );
            ans=Math.max(ans, Math.max(minbestending,maxbestending));
        }
        return ans;
    }
}