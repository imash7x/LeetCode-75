class Solution {
    public int maxVowels1(String s, int k) {
        int count = 0;
        int ans = 0;

        for(int i=0; i<k; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){ 
                count++; 
            }
        }
        ans = count;
        for(int i=k; i<s.length(); i++){
            char left = s.charAt(i);
            char right = s.charAt(i-k);

            if(isVowel(left)){
                count++;
            }
            if(isVowel(right)){
                count--;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public int maxVowels2(String s, int k) {
        int l = 0;
        int r = 0;
        int max = 0;
        int cur = 0;
        while(r < k) {
            if(isVowel(s.charAt(r))) {
                cur += 1;
            }
            r += 1;
        }
        max = cur;
        while(r < s.length()) {
            if(isVowel(s.charAt(r))) {
                cur += 1;
            }
            if(isVowel(s.charAt(l))) {
                cur -= 1;
            }
            max = Math.max(max, cur);
            r += 1;
            l += 1;
        }
        return max;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e';
    }
}
class MaximumNumberVowelsinSubstringofGivenLength{
    public static void main(String[] args) {
        Solution s = new Solution();
        String st1 = "leetcode";
        String st2 = "abciiidef";
        System.out.println(s.maxVowels1(st1, 3)+" "+s.maxVowels2(st2, 3));
    }
}