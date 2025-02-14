import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int i =0;
        List<Integer> stklist = new ArrayList<>();
        
        while(i<arr.length)
        {
            if(stklist.isEmpty())
            {
                stklist.add(arr[i]);
                i++;
            }else
            {
                if(stklist.get(stklist.size() - 1)<arr[i])
                {
                    stklist.add(arr[i]);
                    i++;
                }
                else if(stklist.get(stklist.size() - 1)>=arr[i])
                {
                    stklist.remove(stklist.size() - 1);
                }
            }
            
        }
        stk = stklist.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}