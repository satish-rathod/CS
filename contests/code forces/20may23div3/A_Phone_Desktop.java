import java.util.Scanner;

public class A_Phone_Desktop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(minimumScreens(x, y));
        }
    }
    
    private static int minimumScreens(int x, int y) {
       int ans = 0;
       ans +=Math.ceil((double)y/2);
       int squaresremaning =ans*15-y*4;
         if(squaresremaning>=x)
         {
              return ans;
         }
         else
         {
            while(squaresremaning<x)
            {
                ans++;
                squaresremaning+=15;
            }
         }

        return ans;
    }
}
