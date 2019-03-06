package sda.algorithms.data;

public class Stack {

    private int[] arr;

    private int cap;

    private int top = -1;

    public Stack(int cap) {
        this.cap = cap;
        this.arr = new int[cap];
    }

    public Integer pop() {
        if (this.top == -1) {
            return null;
        }
        return this.arr[top--];
    }

    public boolean push(int e) {
        if (isFull()) {
            return false;
        }
        this.arr[++top] = e;
        return true;
    }

    public boolean isFull() {
        return this.top >= this.cap;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
