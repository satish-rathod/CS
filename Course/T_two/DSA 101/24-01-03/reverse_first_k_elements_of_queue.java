
public class reverse_first_k_elements_of_queue {

    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }
    }

    class stacks {
        
        node top;
        int size;
        
        stacks(){
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
    }

    class myqueue1{

        stacks s1;
        stacks s2;
        
        myqueue1(){
            s1=new stacks();
            s2=new stacks();
        }
        
        void enqueue(int data){
            s1.push(data);
        }
        
        int dequeue(){
            if(s1.isEmpty() && s2.isEmpty()){
                System.out.println("Queue Underflow");
                return -1;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }
        
        int peek(){
            if(s1.isEmpty() && s2.isEmpty()){
                System.out.println("Queue Underflow");
                return -1;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
        
        boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }
        
        void print(){
            if(s1.isEmpty() && s2.isEmpty()){
                System.out.println("Queue Underflow");
                return;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            s2.print();
        }
        
        void reverse(int k){
            if(s1.isEmpty() && s2.isEmpty()){
                System.out.println("Queue Underflow");
                return;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            stacks temp=new stacks();
            while(k-->0){
                temp.push(s2.pop());
            }
            while(!temp.isEmpty()){
                s1.push(temp.pop());
            }
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        int size(){
            return s1.size+s2.size;
        }
    }
    
    public static myqueue1 reverse_first_k_elements_of_queue_fun(myqueue1 q,int k){
       int []arr=new int[k];
         int i=0;
            while(!q.isEmpty() && i<k){
                arr[i++]=q.dequeue();
            }
            for(int j=i-1;j>=0;j--){
                q.enqueue(arr[j]);
            }
            for(int j=0;j<q.size()-k;j++){
                q.enqueue(q.dequeue());
            }
            return q;
    }

    public static void main(String[] args) {
        reverse_first_k_elements_of_queue r=new reverse_first_k_elements_of_queue();
        myqueue1 q=r.new myqueue1();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        
        q.print();
        q=reverse_first_k_elements_of_queue_fun(q,3);
        q.print();
    }
}
