class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String a = eq.equals("!")?ineq:ineq+eq;
        
        answer += a.equals(">=")?(n>=m?1:0):0;
        answer += a.equals("<=")?(n<=m?1:0):0;
        answer += a.equals(">")?(n>m?1:0):0;
        answer += a.equals("<")?(n<m?1:0):0;
        
        return answer;
    }
}