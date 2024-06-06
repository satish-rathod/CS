import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Palindromic_Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            String S = scanner.next(); 

            if(N==1)
            {
                System.out.println("BOB");
                continue;
            }
            else if(N==2)
            {
                if(S.charAt(0) == S.charAt(1))
                {
                    System.out.println("ALICE");
                }
                else
                {
                    System.out.println("BOB");
                }
                continue;
            }

           int c0 = 0, c1 = 0;

            for(int i = 0; i < N; i++)
            {
                if(S.charAt(i) == '0') c0++;
                else c1++;
            }
            int val =Math.abs(c1-c0);

            if(val==0)
            {
                System.out.println("Bob");
            }
            else if(val==1)
            {
                System.out.println("Alice");
            }
            else
            {
                if(val%2==0)
                {
                    System.out.println("Alice");
                }
                else
                {
                    System.out.println("Bob");
                }
            }

                
               
        }
    }
}
