import java.util.*;

class Solution {
    public double minimumAverage(int[] nums) {
        double average[] = new double[nums.length / 2];
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int p = 0;
        while (left <= right) {
            average[p] = (nums[left] + nums[right]) / 2.0 ;
            left++;
            right--;
            p++;
        }
        Arrays.sort(average);
        return average[0];

    }
}