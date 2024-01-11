import java.util.*;

class Solution {
    public List<List<Integer>> findDifference1(int[] nums1, int[] nums2) {
       return Arrays.asList(getCommonValues(nums1,nums2), getCommonValues(nums2, nums1));
    }
    private List<Integer> getCommonValues(int[] nums1, int[] nums2){
           Set<Integer> set1 = new HashSet<>();
           Set<Integer> set2 = new HashSet<>();

           for(int num : nums2){
               set2.add(num);
           }
           for(int num : nums1){
               if(!set2.contains(num)){
                   set1.add(num);
               }
           }
        return new ArrayList<>(set1);
    }

    public List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> notInNums2 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                notInNums2.add(num);
            }
        }

        List<Integer> notInNums1 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                notInNums1.add(num);
            }
        }

        result.add(notInNums2);
        result.add(notInNums1);

        return result;
    }
}


class FindDifferenceOfTwoArrays {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(s.findDifference1(nums1, nums2)+" \n"+s.findDifference2(nums1, nums2));
    }
}
