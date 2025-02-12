import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        answer = IntStream.range(l, r+1)
            .filter(i -> i%5 == 0 && String.valueOf(i).matches("[50]+"))
            .toArray();
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}