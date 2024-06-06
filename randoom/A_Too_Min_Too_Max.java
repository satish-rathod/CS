import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

/**
 * A_Too_Min_Too_Max
 */
public class A_Too_Min_Too_Max {

    static int fun(int arr[],int size)
    {
        Arrays.sort(arr);

        return (Math.abs(arr[0]-arr[size-1])+Math.abs(arr[1]-arr[size-1])+Math.abs(arr[0]-arr[size-2])+Math.abs(arr[1]-arr[size-2]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-->0)
        {
            int size = sc.nextInt();
            int arr [] = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(fun(arr, size));
        }
    
    }    
}