package randoom;
import java.util.Scanner;

class A_Counting_Passes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int pass = sc.nextInt();

        int num = 0;
        for (int i = 0; i < size; i++) {
            if (sc.nextInt() >= pass)
                num++;
        }

        System.out.println(num);
    }
}