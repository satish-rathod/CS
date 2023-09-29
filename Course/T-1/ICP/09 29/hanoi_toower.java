import java.util.Scanner;

public class hanoi_toower {
    
    public static void tower(int n, char source, char destination, char aux)
    {
        if(n==0)
        {
            return;
        }
        tower(n-1, source, aux, destination);
        System.out.println("move a disk from "+source+" to "+destination);
        tower(n-1, aux, destination, source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        tower(n, 'a', 'c', 'b');
    }
}
