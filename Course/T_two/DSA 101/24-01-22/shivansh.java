import java.util.Scanner;

public class shivansh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i=1;

        for(;i*i<=n;i++){

            if(n%i==0){

                System.out.print(i+" ");
            }

        }

        for(;i>=1;i--){

            if(n%i==0 && i!=n/i){

                System.out.print(n/i+" ");

            }

        }

    }
    
}
