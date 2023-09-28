import java.util.Scanner;

class Bit_Play {

    
    public static int count(String S) {
        int m=1000000007;

        int count = 1;
        // System.out.println(S.length());
        for (int i = 0; i < S.length() - 2; i += 2) 
        { 

            if (S.charAt(i) == '0' && S.charAt(i + 1) == '0' && S.charAt(i + 2) == '0') 
            {
                // count *= 3;
                // count%=1000000007;
                count = ((count%m)*3)%m;

            } 
            else if (S.charAt(i) == '0' && S.charAt(i + 1) == '0' && S.charAt(i + 2) == '1') 
            {
                return 0;
            } 
            else if (S.charAt(i) == '0' && S.charAt(i + 1) == '1' && S.charAt(i + 2) == '0') 
            {
                count *= 1;
            } 
            else if (S.charAt(i) == '0' && S.charAt(i + 1) == '1' && S.charAt(i + 2) == '1') 
            {
                // count *= 2;
                // count%=1000000007;
                count = ((count%m)*2)%m;

                
            } 
            else if (S.charAt(i) == '1' && S.charAt(i + 1) == '0' && S.charAt(i + 2) == '0') 
            {
                count *= 1;
            } 
            else if (S.charAt(i) == '1' && S.charAt(i + 1) == '0' && S.charAt(i + 2) == '1') 
            {
                // count *= 2;
                // count%=1000000007;
                count = ((count%m)*2)%m;

                
            } 
            else if (S.charAt(i) == '1' && S.charAt(i + 1) == '1' && S.charAt(i + 2) == '0') 
            {
                count *= 1;
            } 
            else {
               
                count = ((count%m)*2)%m;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        // sc.nextLine(); 

        for (int i = 0; i < T; i++) {
            int n=sc.nextInt();
            String S = sc.next(); 
            System.out.println(count(S)%1000000007);
            // count(S);
        }

        sc.close();
    }
}
