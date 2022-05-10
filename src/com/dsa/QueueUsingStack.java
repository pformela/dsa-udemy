package com.dsa;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        this.stack1.push(x);
    }

    public int pop() {
        if(this.stack1.isEmpty() && this.stack2.isEmpty()) {
            System.exit(0);
        }

        if(this.stack2.isEmpty()) {
            while(!this.stack1.isEmpty()) {
                this.stack2.push(this.stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int peek() {
        if(this.stack1.isEmpty() && this.stack2.isEmpty()) {
            System.exit(0);
        }

        if(this.stack2.isEmpty()) {
            while(!this.stack1.isEmpty()) {
                this.stack2.push(this.stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean empty() {
        return this.stack1.isEmpty() && this.stack2.isEmpty();
    }
}











