class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        int index = 0;
        for(char a:code.toCharArray()){
            if(a=='1')
            {
                if(mode==0)mode = 1;
                else mode = 0;
            }
            
            answer += a!='1'&&mode==0 && index%2==0 ? a:"";
            answer += a!='1'&&mode==1 && index%2!=0 ? a:"";
                
            index++;
        }
        
        if(answer.isEmpty())answer = "EMPTY";
        return answer;
    }
}