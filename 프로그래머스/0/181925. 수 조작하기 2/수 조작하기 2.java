class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int sum = 0;
        
        for(int i=1; i<numLog.length; i++)
        {
            sum = numLog[i-1];
            answer += sum+1 == numLog[i]  ? "w" : "";
            answer += sum-1 == numLog[i] ? "s" : "";
            answer += sum+10 == numLog[i] ? "d" : "";
            answer += sum-10 == numLog[i] ? "a" : "";
        }
        
        
        return answer;
    }
}