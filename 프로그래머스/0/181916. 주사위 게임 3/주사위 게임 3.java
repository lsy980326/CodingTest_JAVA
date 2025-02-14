import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        List<Integer> numlist = new ArrayList<>(Arrays.asList(a,b,c,d));
        Set<Integer> numset = new HashSet<>(numlist);
        List<Integer> uniqueList = new ArrayList<>(numset);
        
        if(uniqueList.size() == 1)
        {
            answer = uniqueList.get(0)*1111;
        }
        else if(uniqueList.size() == 2)
        {
            int t1 = Collections.frequency(numlist, uniqueList.get(0));  
            int t2 = Collections.frequency(numlist, uniqueList.get(1));
            
            if(t1==t2)
            {
                answer = (uniqueList.get(0)+ uniqueList.get(1)) 
                    * Math.abs(uniqueList.get(0)- uniqueList.get(1));
            }
            else
            {
                answer = t1>t2 
                ? (int)Math.pow(10 *  uniqueList.get(0) + uniqueList.get(1),2)
                : (int)Math.pow(10 *  uniqueList.get(1) + uniqueList.get(0),2);
            }
        }else if(uniqueList.size() == 3)
        {
            int t1 = Collections.frequency(numlist, uniqueList.get(0));  
            int t2 = Collections.frequency(numlist, uniqueList.get(1));
            int t3 = Collections.frequency(numlist, uniqueList.get(2));
            
            answer = t1 == t2
                ? uniqueList.get(0) * uniqueList.get(1)
                : (t1 == t3 
                   ? uniqueList.get(0) * uniqueList.get(2) 
                   : uniqueList.get(1) * uniqueList.get(2));
        }else
        {
            answer = Collections.min(uniqueList);
        }

        return answer;
    }
}