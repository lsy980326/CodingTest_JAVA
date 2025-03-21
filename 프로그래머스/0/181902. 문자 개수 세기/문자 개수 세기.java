class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        //65~90 97~122
        for(int i=0; i<my_string.length();i++)
        {
            if(65<=my_string.charAt(i)&&my_string.charAt(i)<=90)
            {
                answer[my_string.charAt(i)-65]+=1;
            }
            if(97<=my_string.charAt(i)&&my_string.charAt(i)<=122)
            {
                answer[my_string.charAt(i)-(97-26)]+=1;
            }
        }
        
        return answer;
    }
}