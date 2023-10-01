import java.util.Scanner;

public class sum_of_digits {

        public static int sum(int n)
        {
            if(n==0)
            {
                return 0;
            }
            int small_ans = sum(n/10);
            int ans = small_ans + n%10;
            return ans;
        }

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            System.out.println(sum(n));
            sc.close();
        }
}
