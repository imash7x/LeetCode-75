class Solution {
    public int[] moveZeroes1(int[] nums) {
        int n = nums.length;
        int idx = 0;

        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[idx] = nums[i];
                idx++;
            }
        }

        for(int i = idx; i < n; i++){
            nums[i] = 0;
        }
        return nums;
    }

    public int[] moveZeroes2(int[] nums) {
    int count =0;
    for(int i=0; i<nums.length;  i++){
        if(nums[i]!=0){
            nums[count++]=nums[i];
        }
    }
    while(count<nums.length){
        nums[count++]=0;
    }
    return nums;
    }
}
class MoveZeroes{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0, 1, 0, 3, 12};    
        int[] ans1 = s.moveZeroes1(nums);
        int[] ans2 = s.moveZeroes2(nums);
        for(int i=0; i<ans1.length; i++){
            System.out.print(ans1[i]+" ");
        }
        System.out.print("\n");
        for(int i=0; i<ans2.length; i++){
            System.out.print(ans2[i]+" ");
        }
    }
}