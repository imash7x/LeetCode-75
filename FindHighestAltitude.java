class Solution {
    public int largestAltitude(int[] gain) {
        int max =0, curr =0;
        for(int i=0; i<gain.length; i++){
            curr += gain[i];
            max = Math.max(curr, max);
        } 
    return max;
    }
}
class FindHighestAltitude {
    public static void main(String[] args) {
        
    Solution s =new Solution();
    int[] gain = {-5,1,5,0,-7};
    System.out.println(s.largestAltitude(gain));
    }
}
