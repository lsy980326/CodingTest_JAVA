class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String b ="";
        String c ="";
        
        for(int a:num_list){
            if(a%2==0)b+=String.valueOf(a);
            else c+=String.valueOf(a);
        }
        answer = Integer.parseInt(b)+Integer.parseInt(c);
        return answer;
    }
}