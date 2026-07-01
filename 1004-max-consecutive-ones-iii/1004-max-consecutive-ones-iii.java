class Solution {
    public int longestOnes(int[] nums, int k) {

        int l=0,zero=0,res=0;

        for(int h=0; h<nums.length; h++){
            if(nums[h]==0)
              zero++;

            while(zero > k){
                if(nums[l] == 0){
                    zero--;
                }

                l++;
            }

            res = Math.max(res , h-l+1);
        }

        return res;
        
    }
}