
public class ques {

    class myqueue1{

        satck2 s1;
        satck2 s2;
        
        myqueue1(){
            s1=new satck2();
            s2=new satck2();
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

        int size(){
            return s1.size+s2.size;
        }
    }

    class myqueue2{
     
        int size;
        int front;
        int rear;
        int[] arr;

        myqueue2(int size){
            this.size=size;
            front=0;
            rear=0;
            arr=new int[size];
        }

        void enqueue(int data){
            if(rear%size<front%size  && rear!=0 && front!=0){
                System.out.println("Queue Overflow");
                return;
            }
            arr[rear%size]=data;
        }

        int dequeue(){
            if(front==rear){
                System.out.println("Queue Underflow");
                return -1;
            }
            return arr[front++];
        }

        int peek(){
            if(front==rear){
                System.out.println("Queue Underflow");
                return -1;
            }
            return arr[front];
        }

        boolean isEmpty(){
            return front==rear;
        }

        void print(){
            if(front==rear){
                System.out.println("Queue Underflow");
                return;
            }
            for(int i=front;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return rear-front;
        }


    }
    
}
