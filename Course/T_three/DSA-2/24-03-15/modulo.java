import java.util.Scanner;
public class modulo {

    public void fun(int size, int[] arr) {
        int odd = 0, even = 0;

        for(int i = 0; i < size; i++) {
            if(arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if(odd%2 == 0) {
            System.out.println(even);
        } else {
            System.out.println(odd);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(fun(size, arr));

        scanner.close();
    }
}
