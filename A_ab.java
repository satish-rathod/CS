import java.util.Scanner;

public class A_ab {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      String s = sc.next();

      boolean flag = false;
      for(int i=0;i<n-1;i++)
      {
          if(s.charAt(i)=='a' && s.charAt(i+1)=='b')
          {
              flag = true;
              break;
          }
          else if(s.charAt(i)=='b' && s.charAt(i+1)=='a')
          {
              flag = true;
              break;
          }
      }

      if(flag)
        System.out.println("Yes");
      else
        System.out.println("No");
    sc.close();
    }
}