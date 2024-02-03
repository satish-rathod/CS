package randoom;
import java.util.ArrayList;
import java.util.Scanner;
class C_Removal_of_Unattractive_Pairs {
    public static int solve(String s)
    {
        ArrayList<Charecters> list = new ArrayList<>();

        boolean flag = true;

        while(flag)
        {
            flag = false;
            for(int i=0;i<s.length()-1;i++)
            {
                if(s.charAt(i)==s.charAt(i+1))
                {
                    flag = true;
                    if(i)
                }
            }
        }

        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0)
        {
            String s = scanner.next();
            System.out.println(solve(s));
        }

    }
}