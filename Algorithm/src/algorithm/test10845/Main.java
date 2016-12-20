package algorithm.test10845;

import java.util.Scanner;

class Queue{
    int [] queue;
    int size = 0;
    int front = -1;
    int rear = -1;

    Queue(int size){
        this.size = size;
        this.queue = new int[size];
    }

    public void enQueue(int n){
        queue[++rear] = n;
    }

    public void deQueue(){
        if(front == rear){
            System.out.println("-1");
        }else{
            System.out.println(queue[++front]);
            queue[front] = 0;
        }
    }

    public boolean isEmpty(){
        if(front == rear) {
            System.out.println("1");
            return true;
        }else {
            System.out.println("0");
            return false;
        }
    }

    public void getFront(){
        if(front == rear){
            System.out.println("-1");
        }else
            System.out.println(queue[front+1]);
    }

    public void getBack(){
        if(front == rear){
            System.out.println("-1");
        }else{
            System.out.println(queue[rear]);
        }
    }

}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue q = new Queue(n);
        for(int i=0; i<n; i++){
            switch (sc.next()){
                case "push":
                    q.enQueue(sc.nextInt());
                    break;
                case "pop":
                    q.deQueue();
                    break;
                case "size":
                    System.out.println(q.rear - q.front);
                    break;
                case "empty":
                    q.isEmpty();
                    break;
                case "front":
                    q.getFront();
                    break;
                case "back":
                    q.getBack();
                    break;
            }
        }
    }
}
