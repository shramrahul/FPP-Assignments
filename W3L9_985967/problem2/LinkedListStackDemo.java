package dady3problem2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListStackDemo implements Stack1{
     int top;
     Node header;

    public LinkedListStackDemo() {
        top=-1;
    }

    private class Node{
        Node prev;
        Object value;
        Node next;

        public Node(Node prev, Object value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

    }

    @Override
    public void push(Object ob) {
        if (isEmpty()){
            header= new Node(null,ob,null);
            top++;
        }
        else {
            Node oldHead=header;
            header=new Node(null,ob,oldHead);
            oldHead.prev=header;
            top++;
        }
    }

    @Override
    public Object pop() {
        if( header==null) return null;
        Object value= header.value;
        header=header.next;
        top--;
        return value;
    }

    @Override
    public Object peek() {
        return header.value;
    }

    @Override
    public boolean isEmpty() {
        return top==-1;
    }

    @Override
    public int size() {

        return top+1;
    }

    public String toString(){
        String str="";
        for(Node i= header; i!=null;i=i.next){
            str+="<---"+i.value+"";
        }
        return str+ "  top =>"+top;
    }

    public static void main(String[] args){
        Stack1 stack= new LinkedListStackDemo();
        stack.push(12);
        stack.push(10);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.push(20);
        stack.push(21);
        System.out.println("\n"+stack.toString());
        System.out.println("stack size="+stack.size());

        System.out.println("stack.pop()="+stack.pop());
        System.out.println("\n"+stack.toString());
        System.out.println("stack size="+stack.size());

        System.out.println("stack.pop()="+stack.pop());
        System.out.println("\n"+stack.toString());
        System.out.println("stack size="+stack.size());

        System.out.println("stack.peek()="+stack.peek());
        System.out.println("\n"+stack.toString());

        stack.push(15);
        System.out.println("\n"+stack.toString());
        System.out.println("stack size="+stack.size());

        System.out.println("stack.pop()="+stack.pop());
        System.out.println("\n"+stack.toString());
        System.out.println("stack size="+stack.size());

        System.out.println("stack.pop()="+stack.pop());
        System.out.println("\n"+stack.toString());
        System.out.println("stack size="+stack.size());

        System.out.println("stack.pop()="+stack.pop());
        System.out.println("\n"+stack.toString());
        System.out.println("stack size="+stack.size());

    }

}
