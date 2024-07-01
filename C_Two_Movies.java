import java.util.PriorityQueue;
import java.util.Scanner;

public class C_Two_Movies {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int test = inp.nextInt();

        while (test-- > 0) {
            int size = inp.nextInt();
            int[] m1 = new int[size];
            int[] m2 = new int[size];
            for (int i = 0; i < size; i++) {
                m1[i] = inp.nextInt();
            }
            for (int i = 0; i < size; i++) {
                m2[i] = inp.nextInt();
            }
            int ans1 = 0;
            int ans2 = 0;

            int extra = 0;

            for (int i = 0; i < size; i++) {
                int x = m1[i];
                int y = m2[i];

                if(x==y)
                {
                    extra+=x;
                }

                else if(x==1 && y==0)
                {
                    ans1++;
                }

                else if(x==0 && y==1)
                {
                    ans2++;
                }

                else if(x==0 || y==0)
                {
                    continue;
                }
                    
                    else if(x>y)
                    {
                        ans1++;
                    }
    
                    else if(y>x)
                    {
                        ans2++;
                    }


            }

            int diff = Math.abs(ans1-ans2);


            System.out.println(extra+Math.abs(ans1-ans2));
        }

        inp.close();
    }
}
