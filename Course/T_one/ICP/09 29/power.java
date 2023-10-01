
public class power {
    
    public static int power(int num, int power,int mod)
    {
        if(power==0)
        {
            return 1;
        }
        long small_ans = power(num,power/2,mod);
        long ans = small_ans*small_ans;
        if(power%2==1)
        {
            ans = ans*num;
        }
        return (int)ans%mod;
    }
}
