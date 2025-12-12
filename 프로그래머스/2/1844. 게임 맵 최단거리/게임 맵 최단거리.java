import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        
        int n=maps.length;
        int m=maps[0].length;

        int[] ud = {0,1,0,-1};
        int[] lr = {1,0,-1,0};
        
        int[][] dist = new int[n][m];
        dist[0][0] = 1;
        
        Queue<int[]> waiting = new LinkedList<>();
        waiting.offer(new int[]{0,0});
        
        while(!waiting.isEmpty())
        {
            
            int[] current = waiting.poll();
            int currentR = current[0];
            int currentC = current[1];
            
            for(int i=0; i<4;i++)
            {
                int nr = currentR + ud[i];
                int nc = currentC + lr[i];
                
                if(nc<0||nr<0||nc>m-1||nr>n-1)continue;
                if(dist[nr][nc]!=0||maps[nr][nc]!=1)continue;
                
                dist[nr][nc] = dist[currentR][currentC]+1;
                waiting.offer(new int[]{nr,nc});
            }
        }

        if(dist[n-1][m-1]==0) return -1;
        else return dist[n-1][m-1];
    }
}