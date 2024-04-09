package com.learning.core.day4session1;
class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public double pop() {
        if (top == null) {
            System.out.println("Stack underflow");
            return Double.MIN_VALUE;
        } else {
            double popped = top.data;
            top = top.next;
            return popped;
        }
    }

    public void display() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class D04P92 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        String[] input = {"10.0", "20.0", "30.0", "40.0"};

        for (String s : input) {
            double num = Double.parseDouble(s);
            stack.push(num);
        }

        stack.display();

        System.out.print("After popping twice: ");
        stack.pop();
        stack.pop();
        stack.display();
    }
}
