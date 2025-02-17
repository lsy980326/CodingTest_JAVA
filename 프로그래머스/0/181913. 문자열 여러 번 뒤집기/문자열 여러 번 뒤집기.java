import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        Stack<Character> temp = new Stack<>();

        for(int[] query:queries)
        {
            String subStr = answer.substring(query[0], query[1]+1); 
            for (char s : subStr.toCharArray()) temp.push(s);
            for(int i=query[0];i<=query[1];i++)
            {
                answer.setCharAt(i,temp.pop());
            }  
        }
        
        return answer.toString();
    }
}