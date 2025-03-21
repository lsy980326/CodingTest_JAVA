class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] temp = code.toCharArray();
        
        for(int i=0;i<temp.length;i++)
        {
            answer += i%q==r?temp[i]:"";
        }
        
        return answer;
    }
}