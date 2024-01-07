import java.util.Arrays;

class Solution {
    public int maxOperations1(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        int l = 0;
        int r =nums.length-1;

        while(l < r){
            if(nums[l] + nums[r] < k){
                l++;
            }else if(nums[l] + nums[r] > k){
                r--;
            }else{
                l++;
                r--;
                ans++;
            }
        }
        return ans;
    }
    
    public int maxOperations2(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        int count=0;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i]+nums[j]==k){
                count++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++; 
            } else {
                j--;
            }
        }return count;
    }
}

class MaxNumberKSum {
    public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {3,1,3,4,3};
    System.out.println(s.maxOperations1(nums, 6));
    System.out.println(s.maxOperations2(nums, 6));
    }
}
