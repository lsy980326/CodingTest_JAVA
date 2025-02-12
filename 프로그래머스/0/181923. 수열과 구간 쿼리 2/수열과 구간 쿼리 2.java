import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        
        for(int[] query:queries)
        {
            int[] temp =  Arrays.copyOfRange(arr, query[0], query[1]+1);
            answerList.add(Arrays.stream(temp)
                            .filter(i -> i > query[2])
                            .min()
                            .orElse(-1)
                          );
            
        }
        
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}