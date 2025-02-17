import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
         List<Long> answer = new ArrayList<>();
        
        for(String num:intStrs)
        {
            if(Long.parseLong(num.substring(s,s+l))>k)
                answer.add(Long.parseLong(num.substring(s,s+l)));
        }
        
        return answer.stream().mapToInt(Long::intValue).toArray();
    }
}