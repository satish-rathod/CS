import java.util.Scanner;

class My_First_Geometry_Problem
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String S = sc.next();
            if(S.equals("1000") || S.equals("0100") || S.equals("0010") || S.equals("0001"))
            {
                System.out.println(11);
            }
            else if(S.equals("1100") || S.equals("0011"))
            {
                System.out.println(21);
            }
            else if(S.equals("1010") || S.equals("0101"))
            {
                System.out.println(121);
            }
            else if(S.equals("1001") || S.equals("0110"))
            {
                System.out.println(121);
            }
            else if(S.equals("1110") || S.equals("0111") || S.equals("1011") || S.equals("1101"))
            {
                System.out.println(231);
            }
            else if(S.equals("1111"))
            {
                System.out.println(441);
            }
            else if(S.equals("0000"))
            {
                System.out.println(1);
            }
        }
    }
}