import java.util.Scanner;

/**
 * C_Arrow_Path
 */
public class C_Arrow_Path {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0){
            int size = sc.nextInt();

            char []row1 = new char[size];
            char []row2 = new char[size];

            String s1 = sc.next();
            String s2 = sc.next();

            for(int i=0;i<size;i++)
            {
                row1[i]=s1.charAt(i);
                row2[i]=s2.charAt(i);
            }

            
        }
    }
}