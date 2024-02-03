
public class n_staire {
    
    public static int maxstaires(int n)
    {
        int start = 0;
        int end = n;
        int ans = 0;

        while (start <= end)
        {
            int mid = (start + end) / 2;

            if (mid * (mid + 1) / 2 == n)
            {
                return mid;
            }
            else if (mid * (mid + 1) / 2 < n)
            {
                start = mid + 1;
                ans = mid;
            }
            else
            {
                end = mid - 1;
            }
        }

        return ans;s
    }
}
