import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i=0; i<candies.length; i++ ){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++ ){
            if(candies[i]+extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
class KidsWiththe_Greatest_NumberofCandies{
    public static void main(String[] args){
        Solution s = new Solution();
        int[] candies = {2,3,5,1,3};
        List<Boolean> result = s.kidsWithCandies(candies, 3);
        System.out.println(result);
    }
}