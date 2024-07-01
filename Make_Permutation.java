import java.util.Arrays;
import java.util.Scanner;

/**
 * Make_Permutation
 */
public class Make_Permutation {

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

            boolean sum = true;
            for(int i=0;i<size-1;i++){
                if((i+1)-arr[i]<0)
                    sum = false;
            }

            if(sum)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}