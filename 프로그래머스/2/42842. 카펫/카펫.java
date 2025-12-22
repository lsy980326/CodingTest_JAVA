class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        int totalSize = brown + yellow;
        
        for (int height = 3; height <= totalSize; height++) {
            if (totalSize % height == 0) {
                
                int width = totalSize / height;
                
                if (width < height) break;
                
                if ((width - 2) * (height - 2) == yellow) {
                    return new int[] {width, height}; 
                }
            }
        }
        
        
        return answer;
    }
}