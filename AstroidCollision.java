import java.util.*;

class Solution {
    public int[] asteroidCollision1(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<asteroids.length; i++){
            if(stack.isEmpty() || asteroids[i]>0){
                stack.push(asteroids[i]);
            }else{
                while(!stack.isEmpty()){
                    int top = stack.peek();
                    if(top < 0){
                        stack.push(asteroids[i]);
                        break;
                    }
                    int modVal = Math.abs(asteroids[i]);
                    if(modVal == top){
                        stack.pop();
                        break;
                    }else if(modVal < top){
                        break;
                    }else{
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int len = stack.size();
        int ansArray[] = new int[len];
        for(int i=len-1; i>=0; i--){
            ansArray[i] = stack.pop();
        }
    return ansArray;
    }
    public int[] asteroidCollision2(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
           //when colloision happen
           while(!stack.isEmpty() && stack.peek()>0 && asteroid<0){
               int sum=asteroid+stack.peek();
               if(sum<0){
                   stack.pop();
               }else if(sum>0){
                   asteroid=0;
               }else{
                   stack.pop();
                   asteroid=0;
               }
           }
           if(asteroid!=0){
               stack.push(asteroid);
           }
        }
     
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result; 
    }
}

class AstroidCollision {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] asteroids = {10,2,-5,4,-10,20,30,-40,40};
        int[] ans1 = s.asteroidCollision1(asteroids);
        int[] ans2 = s.asteroidCollision2(asteroids);
        for(int i=0; i<ans1.length; i++){
            System.out.print(ans1[i]+" ");
        }
        System.out.println(" \n");
        for(int i=0; i<ans1.length; i++){
            System.out.print(ans2[i]+" ");
        }
    }
}
