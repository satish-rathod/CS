import java.util.Scanner;

class B_Prefix_and_Suffix {

    public static int PandS(int A, int B, String S, String P) {

        String pre = "";
        String suf = "";
        
        for (int i = 0; i < A; i++) {
            pre += S.charAt(i);
        }
        for (int i = B - A; i < B; i++) {
            suf += S.charAt(i);
        }

        if (pre.equals(P) && suf.equals(P)) {
            return 0;
        }
        if (pre.equals(S)) {
            return 1;
        }s
        if (suf.equals(S)) {
            return 2;
        }
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        String S = sc.next();
        String P = sc.next();

        System.out.println(PandS(A, B, S, P));
        sc.close();
    }
}
