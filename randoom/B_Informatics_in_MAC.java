import java.util.*;

public class B_Informatics_in_MAC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            findDivision(n, a);
        }
        scanner.close();
    }

    public static int[] calculateMex(int[] arr) {
        int n = arr.length;
        int[] mexArr = new int[n];

        int num = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            set.add(arr[i]);
            while(set.contains(num)) {
                num++;
            }
            mexArr[i] = num;
        }

        return mexArr;
}

static int [] reverse(int [] a)
{
    int n = a.length;
    int [] b = new int[n];
    for(int i = 0; i < n; i++)
    {
        b[i] = a[n - i - 1];
    }
    return b;
}

    public static void findDivision(int n, int[] a) {

        int f1[] = calculateMex(a);
        int f2[] = reverse(calculateMex(reverse(a)));

        boolean sol = false;
        for(int i=0; i<n-1; i++)
        {

            if(f1[i]==f2[i+1])
            {
                sol = true;
                System.out.println(2);
                System.out.println(1+" "+(i+1));
                System.out.println(i+2+" "+(n));
                break;
            }

        }

        if(!sol){
            System.out.println(-1);
        }

        
    }

    public int[] spf(int n){
        int[] spf = new int[n+1];
        for(int i = 0; i <= n; i++){
            spf[i] = i;
        }
        for(int i = 2; i*i <= n; i++){
            if(spf[i] == i){
                for(int j = i*i; j <= n && (spf[j] == j); j+=i){
                        spf[j] = i;
                }
            }
        }
        return spf;
    }
}

