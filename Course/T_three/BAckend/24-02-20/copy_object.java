class copy{
    int a;
    int b;
    copy(int a, int b){
        this.a = a;
        this.b = b;
    }
    copy(copy c){
        a = c.a;
        b = c.b;
    }
    void show(){
        System.out.println("a = "+a+" b = "+b);
    }
}

class student{
    int roll;
    String name;
    student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    student(student s){
        roll = s.roll;
        name = s.name;
    }
    void show(){
        System.out.println("roll = "+roll+" name = "+name);
    }
}

class exam {
    int marks;
    String subject;
    exam(int marks, String subject){
        this.marks = marks;
        this.subject = subject;
    }
    exam(exam e){
        marks = e.marks;
        subject = e.subject;
    }
    void show(){
        System.out.println("marks = "+marks+" subject = "+subject);
    }
}

class reexam {
    int marks;
    String subject;
    reexam(int marks, String subject){
        this.marks = marks;
        this.subject = subject;
    }
    reexam(reexam e){
        marks = e.marks;
        subject = e.subject;
    }
    void show(){
        System.out.println("marks = "+marks+" subject = "+subject);
    }
}
public class copy_object {

    public static void main(String[] args) {
        copy c1 = new copy(10, 20);
        copy c2 = new copy(c1);
        c1.show();
        c2.show();

        student s1 = new student(1, "Rahul");
        student s2 = new student(s1);
        s1.show();
        s2.show();

        exam e1 = new exam(100, "Maths");
        exam e2 = new exam(e1);
        e1.show();
        e2.show();

        reexam r1 = new reexam(90, "Maths");
        reexam r2 = new reexam(r1);
        r1.show();
        r2.show();
    }
    
}
