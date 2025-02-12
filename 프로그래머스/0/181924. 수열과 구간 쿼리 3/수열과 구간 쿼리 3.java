class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i=0;i<queries.length;i++)
        {
            int a = queries[i][0];
            int b = queries[i][1];
            int temp = arr[b];
            
            arr[b] = arr[a];
            arr[a] = temp;
        }
        answer = arr;
        
        return answer;
    }
}