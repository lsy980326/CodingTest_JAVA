class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = my_string.substring(0,s);
        answer += overwrite_string;
        
        int temp = (my_string.length()-s)-overwrite_string.length();
        if(temp>0)answer += my_string.substring(my_string.length()-temp,my_string.length());
        return answer;
        
        
        
    }
}