import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean sw = true;
        
        for(char c : s.toCharArray())
        {
            if(c==' ')
            {
                sb.append(c);
                sw=true;
            }
            else
            {
                if(sw)sb.append(Character.toUpperCase(c));
                else sb.append(Character.toLowerCase(c));
                sw=false;
            }
        }
        
        return sb.toString();
        
    }
}