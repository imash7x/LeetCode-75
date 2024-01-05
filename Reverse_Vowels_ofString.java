class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int start = 0, end = chars.length-1;

        while(start < end){
            while(start < end && vowels.indexOf(chars[start]) == -1){
                start++;
            }
            while(start < end && vowels.indexOf(chars[end]) == -1){
                end--;
            }
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
        return new String(chars);
    }
}
class Reverse_Vowels_String{
    public static void main(String[] args){
        Solution s = new Solution();
        String result = s.reverseVowels("hello");
        System.out.println(result);
    }
}