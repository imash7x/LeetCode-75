import java.util.*;

class Solution {
    public String removeStars1(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                stack.push(ch);
            }else{
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String result = sb.reverse().toString();
        return result;
    }

    public String removeStars2(String s) {
        char [] S = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
        if (S[i]=='*'){
            ans.deleteCharAt(ans.length()-1);
        }
        else{
            ans.append(S[i]);
        }
        }
    return  ans.toString();

    }
}

class RemovingStarsFromaString {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "leet**cod*e";
        System.out.println(s.removeStars1(str));
        System.out.println(s.removeStars2(str));
    }
}
