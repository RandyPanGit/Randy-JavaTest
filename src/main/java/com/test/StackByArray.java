package com.test;


public class StackByArray {
    private int[] stack;
    private int top;

    public StackByArray(int stackSize) {
        stack = new int[stackSize];
        top = -1;
    }

    public boolean push(int item) {
        if (top >= stack.length) {
            System.out.println("stack is full");
            return false;
        }
        stack[++top] = item;
        return true;
    }

    public int pop(){
        if (top == -1) {
            return top;
        }
        return stack[top--];
    }

    public int top(){
        return top;
    }

    public int getMax() {
        int maxValue = stack[0];
        for (int i = 1; i < stack.length; i++) {
            if (stack[i] > maxValue) {
                maxValue = stack[i];
            }
        }
        return maxValue;
    }
}
