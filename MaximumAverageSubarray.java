class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0.0;
        double ans = 0.0;
        int sum = 0;

        for(int i=0; i< k; i++){
            sum += nums[i];
        }
        
        avg = sum * 1.0/k;
        ans = avg;

        for(int i=k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            avg = sum * 1.0/k;
            ans = Math.max(ans, avg);
        }
        return ans;
    }
}
class MaximumAverageSubarray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(s.findMaxAverage(nums, 4));
    }
}
