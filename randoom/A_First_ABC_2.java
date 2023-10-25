package randoom;
import java.util.Scanner;

class A_First_ABC_2 {
    
    public static int isPresent(int N, String S) {
    for (int i = 0; i <= N - 3; i++) {
        if (S.charAt(i) == 'A' && S.charAt(i + 1) == 'B' && S.charAt(i + 2) == 'C') {
            return i+1;
        }
    }
    return -1;
 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        System.out.println(isPresent(N, S));
    }

 
 }

