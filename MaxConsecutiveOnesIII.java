class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount = 0, i = 0;
        int result = 0;

        for(int j=0; j<nums.length; j++){

            if(nums[j] == 0) zerocount++;

            while(zerocount>k){ 
                if(nums[i] == 0)zerocount--;
                i++;
            }
            result = Math.max(result, j-i+1);
        }
    return result;
    }
}
class MaxConsecutiveOnesIII{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(s.longestOnes(nums, 2));
    }
}