import java.util.*;

class Solution {
    public int equalPairs1(int[][] grid) {
        int n = grid.length, ans = 0;
        Map<String, Integer> rowHash = new HashMap<>();
        Map<String, Integer> colHash = new HashMap<>();

        for(int[] row: grid){ 
            StringBuilder sb = new StringBuilder();
            for(int i : row){
                sb.append(i).append("#");
            }
            rowHash.put(sb.toString(), rowHash.getOrDefault(sb.toString(), 0)+1);
        }
        for(int j=0; j<n; j++){  
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                sb.append(grid[i][j]).append("#");
            }

            colHash.put(sb.toString(), colHash.getOrDefault(sb.toString(), 0)+1);

        }

        for(Map.Entry<String, Integer> entry : rowHash.entrySet()){
            String rHash = entry.getKey();
            if(colHash.containsKey(rHash)){
                ans += colHash.get(rHash) * rowHash.get(rHash);
            }
        }
        return ans;
    }
    public int equalPairs2(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int[] row : grid) {
            String rowString = Arrays.toString(row);
            map.put(rowString, map.getOrDefault(rowString, 0) + 1);
        }

        for(int c=0; c < grid.length; c++) {
            int[] col = new int[grid.length];
            for(int r = 0; r < grid.length; r++) {
                col[r] = grid[r][c];
            }
            String colString = Arrays.toString(col);
            count +=map.getOrDefault(colString, 0);
        }
        return count;

    }
}
class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(s.equalPairs1(grid)+" "+s.equalPairs2(grid));
    }
}
