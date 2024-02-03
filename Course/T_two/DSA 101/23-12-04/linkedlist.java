class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }

    node(int data, node next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return "node(" + this.data + ")";
    }


}

class mylinkedlist {
    
    node head;
    node tail;
    int size;

    mylinkedlist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    void addFirst(int data) {
        node n = new node(data);
        if (this.size == 0) {
            this.head = n;
            this.tail = n;
        } else {
            n.next = this.head;
            this.head = n;
        }
        this.size++;
    }

    void addLast(int data) {
        node n = new node(data);
        if (this.size == 0) {
            this.head = n;
            this.tail = n;
        } else {
            this.tail.next = n;
            this.tail = n;
        }
        this.size++;
    }

    void addAt(int data, int idx) {
        if (idx < 0 || idx > this.size) {
            System.out.println("Invalid index");
            return;
        }
        if (idx == 0) {
            addFirst(data);
        } else if (idx == this.size) {
            addLast(data);
        } else {
            node n = new node(data);
            node temp = this.head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            this.size++;
        }
    }

    int removeFirst() {
        if (this.size == 0) {
            System.out.println("List is empty");
            return -1;
        }
        int rv = this.head.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.size--;
        return rv;
    }

    int removeLast() {
        if (this.size == 0) {
            System.out.println("List is empty");
            return -1;
        }
        int rv = this.tail.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            node temp = this.head;
            for (int i = 0; i < this.size - 2; i++) {
                temp = temp.next;
            }
            temp.next = null;
            this.tail = temp;
        }
        this.size--;
        return rv;

    }                                                                                                             
}
