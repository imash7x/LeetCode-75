class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;

        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        for(int id=0; id<nums.length; id++){
            if(nums[id]<=i){
                i=nums[id];
            }else if(nums[id]<=j){
                j=nums[id];
            }else{
                return true;
            }
        }
        return false;
    }
}
class IncreasingTripletSubsequence {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] num = {2,3,5,1,3};
        System.out.println(s.increasingTriplet(num));
    }
}