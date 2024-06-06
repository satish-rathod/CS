t = int(input())
for _ in range(t):
    n, k = map(int, input().split())
    a = list(map(int, input().split()))
    
    a.sort()
    mex = 0
    
    for x in a:
        if x < mex:
            mex += 1
            k -= 1
        else:
            break
    
    while k > 0:
        mex += 1
        k -= 1
    
    print(mex)import java.util.*;

public class MaxMex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int _ = 0; _ < t; _++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            Arrays.sort(a);
            int mex = 0;
            
            for (int x : a) {
                if (x < mex) {
                    mex++;
                    k--;
                } else {
                    break;
                }
            }
            
            while (k > 0) {
                mex++;
                k--;
            }
            
            System.out.println(mex);
        }
        
        scanner.close();
    }
}