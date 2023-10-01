package Course.T_one.ICP.practice;

public class one_to_n {
    
    public static void oneton(int N)
    {
        if(N==1)
        {
            System.out.print(1);
        }
        oneton(N-1);
        System.out.println(N-1);
    }
}
