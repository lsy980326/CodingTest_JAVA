import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1"))
        {
            int countOne = 0;
            for(char c:s.toCharArray())
            {
                if(c=='0')answer[1] = answer[1]+1;
                else countOne = countOne+1;
            }
            answer[0] = answer[0]+1;
            s = Integer.toBinaryString(countOne);
        }
        
        
        return answer;
    }
}