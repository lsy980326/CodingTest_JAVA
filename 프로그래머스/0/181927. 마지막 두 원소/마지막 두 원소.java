class Solution {
    public int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length + 1];

    System.arraycopy(num_list, 0, answer, 0, num_list.length);
        
    int a = num_list[num_list.length - 1];
    int b = num_list[num_list.length - 2];
    answer[num_list.length] = a > b ? a - b : a * 2;
    
    return answer;
    }
}