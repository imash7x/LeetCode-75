class Solution {
    public boolean isSubsequence1(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }

        if(i==s.length()){
            return true;
        }
        return false;
    }
   
    public boolean isSubsequence2(String s, String t) {
        int i = 0, j = 0;
        if (s.length() == 0) return true;
        while (j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                if (i == s.length()) return true;
            }
            j++;
        }
        return false;
    }
}

class isSubsequence {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "ace";
        String t = "abcde";
        System.out.println(sol.isSubsequence1(s, t)+", "+sol.isSubsequence2(s, t));
    }
}
