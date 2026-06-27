class Solution {
    public void sortColors(int[] nums) {
        

        int l=0,mid=0,h=nums.length-1;

        while(mid<=h){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[l];
                nums[l]=temp;
                mid++;
                l++;
            }else if(nums[mid]==1){
                mid++;
                 
            }else{
                int temp=nums[mid];
                nums[mid]=nums[h];
                nums[h]=temp;
                h--;
                
            }
        }
    }
}