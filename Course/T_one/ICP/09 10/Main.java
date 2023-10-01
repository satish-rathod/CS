import java.util.Scanner;

class Circle
{
    int radius;

    public Circle (int r)
    {
        radius = r;
    }

    public float perimeter()
    {
       float perimeter = 2 * 3.14f * radius;
       return perimeter;
    }

    public float area()
    {
        float area = 3.14f * radius * radius;
        return area;
    }

    public boolean equals(Circle c2)
    {
        boolean equals = true;
        if(this.radius != c2.radius)
        {
            equals = false;
        }
        return equals;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("radius of first circle :");
        Circle c1 = new Circle(sc.nextInt());

        System.out.print("radius of second circle :");
        Circle c2 = new Circle(sc.nextInt());
        System.out.println();

        System.out.println("Circle 1");
        System.out.println("Perimeter of C1 :"+c1.perimeter());
        System.out.println("Area of C1 :"+c1.area());

        System.out.println();

        System.out.println("Circle 2");
        System.out.println("Perimeter of C2 :"+c2.perimeter());
        System.out.println("Area of C2 :"+c2.area());

        System.out.println();

        if(c1.equals(c2))
        {
            System.out.println("Both the circles are the same");
        }
        else
        {
            System.out.println("Both the circles are different");
        }
        System.out.println();
        sc.close();
    }
}
