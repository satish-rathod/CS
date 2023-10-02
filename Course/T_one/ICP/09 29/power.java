
public class power {
    
    public static int pow(int A, int B,int C)
    {
        if(B==0)
        {
            return 1;
        }
        long small_ans = pow(A,B/2,C);
        long ans = (small_ans*small_ans)%C;
        if(B%2==1)
        {
            ans = (ans*A)%C;
        }
        return (int)ans%C;
    }
}
