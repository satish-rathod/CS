import java.util.*;
import java.util.Scanner;

public class B_Make_It_Ugly{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int t = 0; t < testCases; ++t) {
            int n = scanner.nextInt();
            int [] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; ++i) {
                arr[i] = scanner.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            if(map.size() == 1) {
                System.out.println(-1);
                continue;
            }
            int x =arr[0];
            int Index = 0;
            int A=n;

            for(int i=0;i<n;i++)
            {
                if(arr[i]==arr[0])
                {
                    Index++;
                }
                else
                {
                    A=Math.min(A,Index);
                    Index=0;
                }
            }
            A=Math.min(A,Index);
            System.out.println(A);
        }
    }
}
