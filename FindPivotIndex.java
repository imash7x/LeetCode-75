class Solution {
    public int pivotIndex(int[] nums) {
       int sum =0;
       for(int i=0; i<nums.length; i++){
           sum += nums[i];
       }
       int leftsum =0;
       for(int i=0; i<nums.length; i++){
           if(leftsum == (sum-leftsum-nums[i])){
               return i;
           }
           leftsum += nums[i];
       } 
       return -1;
    }
}
class FindPivotIndex {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,7,3,6,5,6};
        System.out.println(s.pivotIndex(nums));
    }
}
