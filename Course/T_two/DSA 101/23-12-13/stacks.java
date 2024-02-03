
public class stacks {

    int top;
    int arr[];
    int size;

    stacks(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stacks s = new stacks(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.print();
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        s.print();
    }

    
}
