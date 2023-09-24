import java.util.Scanner;
public class Cheeseburger_2 {
    
    public static void main(String[] args) {
        long t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i=0;i<t;i++) {
            System.out.print("Case #"+(i+1)+": ");
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long ans=0;
            {
                long d = c/b;
                long s = c%b/a;
                long bun = (d+s)*2;
                long patty = d*2 + s;
                ans = Math.max(ans, (bun == patty) ? patty - 1 : patty);
                
            }
            {
                long s = c/a;
                long d = c%a/b;
                long bun = (s+d)*2;
                long patty = s + d*2;
                ans = Math.max(ans, (bun == patty) ? patty - 1 : patty);
            
            }
            System.out.println(ans);
            sc.close();
        }
    }

}
