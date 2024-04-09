package com.learning.core.day4session1;
public class D04P96 {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int currentSize;

    public D04P96(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = -1;
        rear = -1;
        currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        queueArray[rear] = item;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int dequeuedItem = queueArray[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        currentSize--;
        return dequeuedItem;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in circular queue: ");
        int count = 0;
        int index = front;
        while (count < currentSize) {
            System.out.print(queueArray[index] + " ");
            index = (index + 1) % capacity;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub        
    	D04P96 queue = new D04P96(4);
        queue.enqueue(14);
        queue.enqueue(13);
        queue.enqueue(22);
        queue.enqueue(-8);

        queue.printQueue();

        // Removing the first element
        queue.dequeue();
        System.out.print("After removing first element: ");
        queue.printQueue();
    }
}
