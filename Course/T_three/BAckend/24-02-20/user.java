

 class Parent {

    public void display() {
   
    System.out.println("This is the Parent class.");
   
    }
   
   }
   
   
 class Child extends Parent {
   
    public void display() {
   
    super.display();
   
    System.out.println("This is the Child class.");
   
    }
   
   }
   public class user {
   
    public static void main(String[] args) {
   
    Child child = new Child();
   
    child.display();
   
    }
   
   }