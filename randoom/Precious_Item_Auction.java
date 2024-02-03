package randoom;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t-- > 0) {

    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    int max  = 0, min = 0;

    if (k != 1) {
    for (int i = 0; i < k-1; i++) {
        min += arr[i];
    }
    min += arr[n-k-1];
   } else {
    min = arr[n-2];
   }

    for (int i = n-2; i >= n-2*k; i-=2) {
        max += arr[i];
    }

    System.out.println(min + " " + max);  
    
}

 
}

}
