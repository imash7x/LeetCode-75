class Solution {
    public int longestSubarray1(int[] nums) {
        int prev =0, curr =0, ans =0;

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if( element == 1) curr++;
            else{
                ans = Math.max(ans, curr+prev);
                prev = curr;
                curr = 0;
            }
            ans = Math.max(ans, curr+prev);
            if(nums.length == ans){
                ans = ans-1;
            }
        }
        return ans;
    }

    public int longestSubarray2(int[] nums) {
       
        int n = nums.length;
        int i = 0, j = 0;
        int  mxcnt = 0, cnt0 = 0;

        while(j < n) {
            if(nums[j] == 0) {
                cnt0++;
                while(cnt0 > 1) {
                    //shrinking the window
                    if(nums[i] == 0) {
                        cnt0--;
                    }
                    i++;
                }
            }
            mxcnt = Math.max(mxcnt, j - i + 1 - cnt0);
            j++;
        }
        return (mxcnt == n) ? mxcnt - 1 : mxcnt;
    }
}

class LongestSubarrayofOnesAfterDeletingOneElement {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(s.longestSubarray1(nums)+" "+s.longestSubarray2(nums));
    }
}
