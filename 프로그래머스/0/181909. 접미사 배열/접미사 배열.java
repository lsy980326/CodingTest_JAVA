import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        List<Character> charlist = my_string.chars()
                                            .mapToObj(c -> (char) c) 
                                            .collect(Collectors.toList());
        List<Character> uniqueList = new ArrayList<>(new HashSet<>(charlist));
        
        
        for(char item: uniqueList)
        for(int i=charlist.size()-1; i>=0; i--)
        if(item==charlist.get(i))answer.add(my_string.substring(i));
        
        
        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }
}