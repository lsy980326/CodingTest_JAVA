class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[][] temp = new char[my_string.length()/m][m];
        char[] my_char = my_string.toCharArray();
        int index=0;
        
        for(int i=0;i<my_string.length()/m;i++)
        {
            for(int j=0;j<m;j++)
            {
                temp[i][j]=my_char[index++];
            }
           answer+=temp[i][c-1];
        }
        
        
        
        return answer;
    }
}