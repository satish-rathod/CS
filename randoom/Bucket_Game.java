import java.util.Scanner;
public class Bucket_Game 
{

    public static boolean draw(int[] arr)
    {
        int len = arr.length;
        boolean all  = true;
        for(int i=0;i<len\;i++)
            if(arr[i] != 1)
            {
                all = false;
                break;
            }
        return len%2 == 0 && all;
    }

    static void fun(int size, int[] arr) 
    {
        int odd = 0, even = 0;

        if(!draw(arr))
        {
            for(int i = 0; i < size; i++) 
                if(arr[i] % 2 == 0) 
                    even++;
                else
                    odd++;
                    
            if(odd%2 == 0) 
                System.out.println("Bob");
            else
                System.out.println("Alice");    
        }
        else
            System.out.println("Draw");
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        while(test-- > 0) 
        {    
            int size = scanner.nextInt();
            int[] arr = new int[size];
    
            for(int i = 0; i < size; i++) 
                arr[i] = scanner.nextInt();
            fun(size, arr);
        }
        scanner.close();
    }
}
