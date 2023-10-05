
public class vector {
    
    public static int order (int A)
    {
        int count = 0;
        while(A>0)
        {
            A = A/10;
            count++;
        }
        return count;
    }
}
