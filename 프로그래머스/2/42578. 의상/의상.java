import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;
import java.util.List;

class Solution {
    public int solution(String[][] clothes) {
        // 1. 각 부위 별 수량 구하기
        Map<String, Long> partCount = Arrays.stream(clothes)
            .collect(Collectors.groupingBy(
                part -> part[1],
                Collectors.counting()
            ));
            
        System.out.println(partCount);
        
        // 2. 경우의 수 구하기
        int answer = partCount.values().stream()
            .mapToInt(Long::intValue)
            .reduce(1, (total, count) -> total * (count + 1)) - 1;
        
        System.out.println(answer);
        
        return answer;
    }
}