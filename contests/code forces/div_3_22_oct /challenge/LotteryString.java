import java.util.Scanner;

public class LotteryString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine(); 
            
            String smallestString = getLexicographicallySmallest(s);
            System.out.println(smallestString);
        }
        
        scanner.close();
    }
    
    public static String getLexicographicallySmallest(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        
        int breakIndex = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (chars[i] > chars[i + 1]) {
                breakIndex = i;
                break;
            }
        }
        
        if (breakIndex == -1) {
            return s; // String is already lexicographically smallest
        }
        
        // Find the smallest character from breakIndex + 1 to end
        int minIndex = breakIndex + 1;
        for (int i = breakIndex + 1; i < n; i++) {
            if (chars[i] < chars[minIndex] && chars[i] > chars[breakIndex]) {
                minIndex = i;
            }
        }
        
        // Swap characters
        char temp = chars[breakIndex];
        chars[breakIndex] = chars[minIndex];
        chars[minIndex] = temp;
        
        // Reverse the substring from breakIndex + 1 to end
        reverseSubstring(chars, breakIndex + 1, n - 1);
        
        return new String(chars);
    }
    
    public static void reverseSubstring(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
