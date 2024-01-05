class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length -1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
class ReverseWordsString {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.reverseWords("  Hello World"));
    }
}
