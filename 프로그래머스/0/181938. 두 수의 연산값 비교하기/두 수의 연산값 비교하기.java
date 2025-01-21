class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int ba = (2*a*b);
        return Math.max(ab,ba);
    }
}