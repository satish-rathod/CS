import java.util.Scanner;

class C_1_Parental_Favoritism_Easy_Version {
    
    public static int path (int l1, int r1, int l2, int r2)
    {
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0)
        {
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(path(l1, r1, l2, r2));
        }
    }
}