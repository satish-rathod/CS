import java.util.Scanner;

/**
     * B_Battle_Cows
     */
    public class B_Battle_Cows {

        static int fun(int[] arr, int n, int k) {
            
            int num = arr[k-1];
            int max = 0;
            int maxIndex = 0;

            for(int i=0; i<n; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }

            if(max == num) {
                return n-1;
            }
            



        }
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int[] arr = new int[n];

                for(int i=0; i<n; i++) {
                    arr[i] = scanner.nextInt();
                }

                System.out.println(fun(arr, n, k));
            }
        }
    }