public class Assignment03Question07 {
    public static void main(String[] args) {
        Queue q = new Queue();

        if(q.empty())
            System.out.println("queue is empty");
        else
            System.out.println("Queue is not empty");
        for(int i = 1; i < 21; i++) {
            q.enqueue(i);
            q.display();
        }
        //q.display();
        System.out.println("Size = " + q.getSize());
        /*if(q.empty())
            System.out.println("queue is empty");
        else
            System.out.println("Queue is not empty");
        System.out.println(q.getSize());*/

        //q.display();
        for(int i = q.getSize() - 1; i >= 0; i--) {
            //System.out.println(i);
            q.dequeue();
            q.display();
        }
        //q.display();
        //System.out.println(q.getSize());
        /*if(q.empty())
            System.out.println("queue is empty");
        else
            System.out.println("Queue is not empty");*/
        System.out.println("Size = " + q.getSize());
    }
}

class Queue {
    int[] elements; // stores the int values in the queue
    int size; //represents number of elements already stored in array
    // constructor creates queue object with default capacity 8
    Queue() {
        elements = new int[8];
        // Queue obj = new Queue();
        //obj.elements = new int[8];
    }
    // adds objects to the back of the queue
    void enqueue(int v) {
        if(size == elements.length - 1){
            int[] newElements = new int[elements.length * 2];
            for(int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
                //size = (++size) % elements.length;
            }
            elements = new int[newElements.length];
            for(int i = 0; i < elements.length; i++) {
                elements[i] = newElements[i];
            }
            //size = (++size);
        }
        elements[size] = v;
        size = (++size) % elements.length;
    }
    // removes objects from the front of the queue
    void dequeue() {
        //elements[0] = elements[1];
        //System.out.println("size = " + size);
        for(int i = 0; i < size; i++) {
            //System.out.printf(elements[i] + " ");
            elements[i] = elements[i+1];
        }
        size = (--size) % elements.length;
        //System.out.println("size = " + size);
    }
    // returns true or false if the queue is empty
    boolean empty() {
        return (size == 0);
    }
    // returns the size of the queue
    int getSize() {
        return size;
    }
    void display() {
        if(empty())
            System.out.println("Queue is empty");
        else {
            System.out.println();
            for (int i = 0; i < size; i++) {
                System.out.printf(elements[i] + " ");
            }
            System.out.println();
        }
    }
}
