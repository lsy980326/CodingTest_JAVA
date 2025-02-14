import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> skt = new Stack<>();
        int i=0;
        
        while(i<arr.length)
        {
            if(skt.isEmpty())
            {
                skt.push(arr[i++]);
            }
            else if(skt.peek()<arr[i])
            {
                skt.push(arr[i++]);
            }
            else if(skt.peek()>=arr[i])
            {
                skt.pop();
            }
        }

        return skt.stream().mapToInt(Integer::intValue).toArray();
    }
}