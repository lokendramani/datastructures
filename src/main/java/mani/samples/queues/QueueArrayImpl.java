package mani.samples.queues;

import java.util.Random;

public class QueueArrayImpl {
    int front;
    int rear;
    int []array;


    public QueueArrayImpl(int size) {
        this.front = 0;
        this.rear = -1;
        this.array = new int[size];
    }

    public void add(int num){
        if(front == array.length){
            System.out.println("Queue is full");
            return;
        }
        array[front++] = num;
        System.out.println(" After adding queue structure is:");
        printQueue();

    }

    private void printQueue(){
        for (int i = 0; i < front; i++) {
            System.out.print("item ["+(i+1) +"] =>"+array[i]);
        }
        System.out.println("");

    }


    public static void main(String[] args) {
        QueueArrayImpl queue = new QueueArrayImpl(5);
        Random rd = new Random();
        for (int i = 0; i < 6; i++) {
            queue.add(rd.nextInt());
        }

    }
}
