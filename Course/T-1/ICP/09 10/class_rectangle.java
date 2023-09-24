import java.util.Scanner;
class Rectangle
    {
        int length;
        int bredth;

        public Rectangle(int l, int b)
        {
            this.length = l;
            this.bredth = b;
        }

        public int Perimeter()
        {
            int Perimeter = 2 * length + 2 * bredth;
            return Perimeter;
        }

        public int Area()
        {
            int Area = length * bredth;
            return Area;
        }

        public boolean square_check()
        {
            boolean square_check = true;
            if (this.length != this.bredth)
            {
                square_check = false;
            }
            return square_check;
        }
    }


public class class_rectangle {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth:");

        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle R1 = new Rectangle(l, b);

        System.out.println("Perimeter: " + R1.Perimeter());
        System.out.println("Area: " + R1.Area());
        System.out.println("Is it a square? " + R1.square_check());
    }
}
