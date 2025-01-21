class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int d = a+b+c;
        int e = (int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
        int f = (int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
        
        answer = a == b && a == c ? d*e*f : (a != b && a != c && b != c ? d : d*e);
        
        
        return answer;
    }
}