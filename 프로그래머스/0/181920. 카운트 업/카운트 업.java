import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        answer = IntStream.range(start_num, end_num+1).toArray();
        return answer;
    }
}