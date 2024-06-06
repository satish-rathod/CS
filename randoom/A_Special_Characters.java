import java.util.Scanner;

public class A_Special_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // value of n for current test case
            
            if(n%2==1){
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
                for(int j=0;j<n;j+=2)
                {
                    if(j%4==0)
                    {
                        System.out.print("AA");
                    }
                    else
                    {
                        System.out.print("BB");
                    }
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
