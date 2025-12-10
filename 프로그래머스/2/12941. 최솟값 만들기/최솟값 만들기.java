import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int index = B.length-1;
        for(int i: A)
        {
            answer = answer + (i * B[index--]);
        }

        return answer;
    }
}