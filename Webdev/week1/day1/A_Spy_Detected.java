import java.util.Scanner;

class A_Spy_Detected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=0;t<test;t++)
        {
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int j=0;j<size;j++)
            {
                arr[j] = sc.nextInt();
            }

            if(arr[0]!=arr[1] && arr[0]!=arr[2])
            {
                System.out.println(1);
                continue;
            }
            for(int i=1;i<size-1;i++)
            {
                if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1])
                {
                    System.out.println(i+1);
                    break;
                }
            }
            if(arr[size-1]!=arr[size-2] && arr[size-1]!=arr[size-3])
            {
                System.out.println(size);
                continue;
            }

        }
    }
}