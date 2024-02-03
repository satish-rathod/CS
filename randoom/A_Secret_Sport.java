package randoom;
import java.util.Scanner;

class A_Secret_Sport {

    public static char lastele(String str, int len) {
        
        char ch = str.charAt(len - 1);
        return ch;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            
            int len = sc.nextInt();

            String str = sc.next();

            System.out.println(lastele(str, len));

            sc.close();
        }
    }
}