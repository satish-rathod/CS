package CP.cses.intro;

import java.util.Scanner;

public  class Repetitions {
    
    public int longest_repetition(String s) {
        int max = 0;
        int count = 1;
        char prev = s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
                prev = s.charAt(i);
            }
        }
        
        return Math.max(max, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        System.out.println();
        
    }
}
