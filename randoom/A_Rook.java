package randoom;
import java.util.Scanner;

class A_Rook {

    public static void funtion(char a,int b){
    
      for(int i=1;i<=8;i++){
          if(i!=b)
            System.out.println(a+""+i);
      }

      for(int i=97;i<=104;i++){
          if(i!=a)
            System.out.println((char)i+""+b);
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for(int i=0;i<test;i++){
           
            String s = sc.next();
            char a = s.charAt(0);
            int b = s.charAt(1)-'0';

            funtion(a,b);
        }
    }
}