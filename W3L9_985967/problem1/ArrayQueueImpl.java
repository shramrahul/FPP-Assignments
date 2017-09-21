package day3problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[2];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        return arr[front];
//implement
    }

    public void enqueue(int obj){
//implement
        if(rear==arr.length-1) resize();

          if (isEmpty()) front++;
            arr[rear++]= obj;

    }

    public int dequeue() {
        int value;
            if(!isEmpty()){
                value=arr[front];
                if(front==rear) {
                    front = -1;
                    rear = 0;
                }else{
                    ++front;
                }
                return value;
            }
        System.out.println("Queue is Empty");
        return -1;
//implement
    }
    public boolean isEmpty(){
//implement
        return (front==-1 && rear==0);
    }
    public int size(){
//implement
        return rear-front;
    }
    private void resize(){
//implement
        System.out.println("resizing........");
        int len= arr.length;
        int [] temp= new int[len*2];
        System.arraycopy(arr,0,temp,0,len);
        arr=temp;
    }

    public String toString(){
        String str="";
//        for (int i:arr) {
//            str+=i+"-->";
//        }
//        return str;
        String string="[";
        for(int i=front; i<rear;i++){
            string+=arr[i]+ " ";
        }
        string+="]";
        return "Queue [front=" + front + ", rear=" + rear + ", size="+ size()+ ", queue=" + string;
    }
}