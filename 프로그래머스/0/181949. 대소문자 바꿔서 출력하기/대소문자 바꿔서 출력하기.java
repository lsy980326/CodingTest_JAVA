import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
            {
                result += String.valueOf(a.charAt(i)).toLowerCase();
            }else
            {
                result += String.valueOf(a.charAt(i)).toUpperCase();
            }
        }
        
        System.out.println(result);
        
    }
}