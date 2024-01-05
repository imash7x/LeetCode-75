class Solution {
    public int compress1(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i=1;
        int count = 1;
        sb.append(chars[0]);

        while(i<chars.length){
            if(chars[i] == chars[i-1]){
                count++;
            }else{
                if(count>1){
                    sb.append(count);
                }
                sb.append(chars[i]);
                count =1;
            }
            i++;
        }
        if(count>1){
            sb.append(count);
        }
        for(int j=0; j<sb.length(); j++){
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }
    
    public int compress2(char[] chars) {
        int write = 0, read = 0;
        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            chars[write++] = currentChar;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}
class StringCompression{
    public static void main(String[] args){
        Solution s = new Solution();
        char[] chars = {'a','a','b','b','c','c'};
        System.out.println(s.compress1(chars));
        System.out.println(s.compress2(chars));
    }
}