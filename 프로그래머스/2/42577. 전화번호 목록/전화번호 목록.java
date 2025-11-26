import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //1. 해시로 만듬(containsKey 사용목적)
        Map<String,Integer> map = new HashMap<>();
        for(String num: phone_book) map.put(num,1);
        
        //2. 순회하면서 접두어 확인 (i<phone.length로 자신 제외)
        for(String phone: phone_book){
            for(int i=1;i<phone.length();i++)
                if(map.containsKey(phone.substring(0,i))) return false;
        }
        
        return answer;
    }
}