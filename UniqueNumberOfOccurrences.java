import java.util.*;

class Solution {
    public boolean uniqueOccurrences1(int[] arr) {
        if(arr.length == 0){
            return false;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
       
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        Set<Integer> set = new HashSet<>(map.values());
        if(map.size() == set.size()){
            return true;
        }
        return false;
    }
    public boolean uniqueOccurrences2(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for(int num : arr){
            if(freqMap.containsKey(num)){
                freqMap.put(num,freqMap.get(num)+1);
            }else{
                freqMap.put(num,1);
            }
        }
        int totalFreqs = freqMap.values().size();
        int totalUniqueFreqs = new HashSet<Integer>(freqMap.values()).size();
        return totalFreqs == totalUniqueFreqs;
    }
}
class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,1,2,2,1,1,3};
        System.out.println(s.uniqueOccurrences1(arr)+" \n"+s.uniqueOccurrences2(arr));
    }
}
