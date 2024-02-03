public class set_unset {
    
    public static void setunset(int a, int b)
    {
        a=(int) (a/Math.pow(2, b));
        if(a%2==0)
            System.out.println("Unset");
        else
            System.out.println("Set");
    }

    public static int count_set(int a)
    {
        int count=0;
        while(a!=0)
        {
            if((a&1)==1)
                count++;
            a=a/2;
        }
        return count;
    } 



    public static void main(String[] args) {
        setunset(10, 1);
        System.out.println(count_set(10));
    }
}
