class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        next=null;
    }
}

public class satck2 {
    
    node top;
    int size;
    
    satck2(){
        top=null;
        size=0;
    }
    
    void push(int data){
        node temp=new node(data);
        temp.next=top;
        top=temp;
        size++;
    }
    
    int pop(){
        if(top==null){
            System.out.println("Stack Underflow");
            return -1;
        }
        int data=top.data;
        top=top.next;
        size--;
        return data;
    }
    
    int peek(){
        if(top==null){
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }
    
    boolean isEmpty(){
        return top==null;
    }
    
    void print(){
        node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        satck2 s=new satck2();
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
