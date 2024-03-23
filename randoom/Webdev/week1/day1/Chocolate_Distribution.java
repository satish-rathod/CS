import java.util.Scanner;

class Chocolate_Distribution {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
           int num = sc.nextInt();
           System.out.println( (num%2==1 ? num/2+1:num/2)+" "+num);
        }
    }
}