class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        for(char num:number.toCharArray())
        {
            sum = sum + Integer.parseInt(String.valueOf(num));
        }
        return answer = sum%9;
    }
}