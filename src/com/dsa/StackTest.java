package com.dsa;

class Stack<T> {

    Node<T> top = null;
    Node<T> bottom = null;
    int length = 0;

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public T peek() {
        return this.top.data;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if(this.length == 0) {
            this.bottom = newNode;
            this.top = this.bottom;
        } else {
            if(this.top == this.bottom) {
                this.top = newNode;
                this.top.next = this.bottom;
            }
            else {
                Node<T> currNode = this.top;
                this.top = newNode;
                this.top.next = currNode;
            }
        }
        this.length++;
    }

    public T pop() {

        if(this.top == null) return null;

        Node<T> poppedNode = this.top;

        this.top = this.top.next;
        this.length--;
        return poppedNode.data;
    }

    public void printStack() {
        Node<T> currentNode = this.top;

        while(currentNode != null) {
            System.out.print(currentNode.data);
            if(currentNode.next != null)
                System.out.print(" -> ");
            else
                System.out.println();
            currentNode = currentNode.next;
        }
    }
}

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.printStack();

        System.out.println("Popped item: " + stack.pop());

        stack.printStack();

        System.out.println(stack.peek());

        stack.push(6);
        stack.push(7);
        stack.push(8);

        stack.printStack();
        System.out.println(stack.peek());
    }
}
