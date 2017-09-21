package day3problem1;

public class Test {
    public static void main(String [] args){
        ArrayQueueImpl queue= new ArrayQueueImpl();
        System.out.println("queue.isEmpty()="+queue.isEmpty());

        System.out.println("queue.dequeue()="+queue.dequeue());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.toString());

        System.out.println("queue.dequeue()="+queue.dequeue());
        System.out.println(queue.toString());

        queue.enqueue(70);
        System.out.println(queue.toString());

        System.out.println("queue.dequeue()="+queue.dequeue());
        System.out.println(queue.toString());

        System.out.println("queue.peek()="+queue.peek());
        System.out.println(queue.toString());



    }
}
