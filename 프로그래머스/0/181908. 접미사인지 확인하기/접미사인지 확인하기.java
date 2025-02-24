import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] suffixArray = new String[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            suffixArray[i] = my_string.substring(i);
        }
        
        if(Arrays.stream(suffixArray).anyMatch(is_suffix::equals))answer=1;
        
        return answer;
    }
}

