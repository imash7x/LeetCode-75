import java.util.*;

class Solution {
    public String predictPartyVictory(String senate) {
        ArrayDeque<Integer> rq = new ArrayDeque<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        char[] str = senate.toCharArray();
        int size = senate.length();
        for(int i=0;i<str.length;i++){
            if(str[i]=='R')
                rq.addLast(i);
            else
                dq.addLast(i);
        }
        while(!rq.isEmpty() && !dq.isEmpty()){
            if(rq.getFirst()<dq.getFirst()){
                rq.addLast(size++);
            } else {
                dq.addLast(size++);
            }
            rq.removeFirst();
            dq.removeFirst();
        }
        return (rq.size()!=0) ? "Radiant": "Dire";
    }

    public String predictPartyVictory1(String senate) {
     int n = senate.length();
     Queue<Integer> Ridx = new LinkedList<>();
     Queue<Integer> Didx = new LinkedList<>();

        for(int i=0; i<n; i++){
            if(senate.charAt(i) == 'R'){
                Ridx.add(i);
            }else{
                Didx.add(i);
            }
        }
        while(!Ridx.isEmpty() && !Didx.isEmpty()){
            int i = Ridx.poll();
            int j = Didx.poll();

            if(i<j){
                Ridx.add(i+n);
            }else{
                Didx.add(j+n);
            }
        }
        return Ridx.isEmpty() ? "Dire" : "Radiant";
           
    }
}
class Dota2Senate{
    public static void main(String[] args) {
        Solution s = new Solution();
        String senate1 = "RDD";
        String senate2 = "RD";
        System.out.println(s.predictPartyVictory(senate1)+" "+s.predictPartyVictory1(senate2));
    }
}