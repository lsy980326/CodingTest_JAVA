class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        int b = 0;
        
        for(int c:num_list)
        {
            a=a*c;
            b=b+c;
        }
        
        answer = a>(int)Math.pow(b,2) ? 0:1;
        
        return answer;
    }
}