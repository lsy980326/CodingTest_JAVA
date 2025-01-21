class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int data = a;
        for (boolean c : included) {
            answer += c ? data:0;
            data +=d;
        }
        
        return answer;
    }
}