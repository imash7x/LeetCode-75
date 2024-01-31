import java.util.*;

class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        this.queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.peek() < t-3000){ 
            queue.poll();
        }
        return queue.size();
    }
}
class NumberofRecentCalls {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        int param_1 = recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
        int param_2 = recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
        int param_3 = recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
        int param_4 = recentCounter.ping(3002);
        System.out.println(param_1+" "+param_2+" "+param_3+" "+param_4);
    }
}
