import java.util.Scanner;
public class elements_of_array {

        public static void recur_elements(int A[],int i)
        {
            if(i==A.length)
            {
                return;
            }
            //ordering of the below two lines is important
            recur_elements(A,i+1);
            System.out.print(A[i]+" ");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();

            int A[] = new int[size];

            for(int i=0;i<size;i++)
            {
                A[i] = sc.nextInt();
            }

            int i=sc.nextInt();
            recur_elements(A,i);

            sc.close();
        }
}
