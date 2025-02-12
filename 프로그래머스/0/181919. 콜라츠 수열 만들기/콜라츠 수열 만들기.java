import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>(Arrays.asList(n));
        int a = n;
        
        while(true)
        {
            a = a%2==0 ? a/2 : 3*a+1;
            list.add(a);
            if(a==1)break;
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}