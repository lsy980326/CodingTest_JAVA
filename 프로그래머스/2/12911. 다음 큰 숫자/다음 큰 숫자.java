class Solution {
    public int solution(int n) {
        int answer = n+1;
        long nCount = Integer.bitCount(n);
        
        
        while(true)
        {
           if(nCount ==  Integer.bitCount(answer)) 
               return answer;
            
           answer++;
        }
    }
}