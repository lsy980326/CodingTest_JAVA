import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] numArray = s.split(" ");
        
        int[] intArray = Arrays.stream(numArray)
            .mapToInt(Integer::parseInt)
            .sorted()
            .toArray();
        
        String answer = intArray[0] +" "+ intArray[intArray.length - 1];
        return answer;
    }
}