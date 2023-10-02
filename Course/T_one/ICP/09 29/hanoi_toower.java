import java.util.Scanner;

public class hanoi_toower {
    
    public static void tower(int n, char source, char destination, char aux)
    {
        if(n==0)
        {
            return;
        }
        tower(n-1, source, aux, destination);
        System.out.println("move a disk from "+source+" to "+destination);
        tower(n-1, aux, destination, source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        tower(n, 'a', 'c', 'b');
    }

    public static int[][] TOH(int A)
    {
        int arr[][] = new int[(int)Math.pow(2, A)-1][2];
        
        if(A==0)
        {
            return arr;
        }
        TOH(A-1);
        arr[0][A]=1;
        arr[0][1]=3;
        arr[0][2]=1;
        TOH(A-1);
        
    }
}
