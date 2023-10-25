import java.util.Scanner;

public class pincode {
    
    public static int clicks(int A)
    {
        int arr[] = new int[4];

        for(int i = 0; i < 4; i++) {
            arr[i] = A % 10;
            A = A / 10;
        }

        int clicks = 4;
        int curr = 1;
        
        for(int i = 3; i >=0; i--) {
            if(arr[i] == 0) {
                arr[i] = 10;
                 clicks += Math.abs((arr[i] - curr));

        
            } else {
                clicks += Math.abs((arr[i] - curr));
            }
            curr = arr[i];
        }

        return clicks;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for(int i = 0; i < test; i++) {
            int num = sc.nextInt();
            System.out.println(clicks(num));
        }

        sc.close();
    }
}
