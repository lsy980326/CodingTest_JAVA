import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        int start_index = 0;
        int end_index = people.length-1;
        
        Arrays.sort(people);
        
        
        while (start_index <= end_index)
        {
            if(people[start_index] + people[end_index] <=limit) start_index++;
            end_index--;
            answer++;    
        }
       
        
        return answer;
    }
}