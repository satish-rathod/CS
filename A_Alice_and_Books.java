import java.util.Scanner;
import java.util.Arrays;

/**
 * A_Alice_and_Books
 */
public class A_Alice_and_Books {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int test = inp.nextInt();

        while(test-- > 0) {
            int size = inp.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = inp.nextInt();
            }

             Arrays.sort(arr);
            
            int maxPages = arr[size - 1] + arr[size - 2];
            
            System.out.println(maxPages);
          
        }
    }
}