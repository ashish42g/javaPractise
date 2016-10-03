package Stack;

import Stack.Stack;

public class ArrayStack implements Stack {

    private int top = -1;
    private Object[] stack;

    public ArrayStack(int maxElements) {
        stack = new Object[maxElements];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public Object peek() {
        if (top < 0)
            throw new java.util.EmptyStackException();
        return stack[top];
    }

    public void push(Object o) {
        if (top == stack.length - 1)
            throw new FullStackException();
        stack[++top] = o;
    }

    public Object pop() {
        if (top < 0)
            throw new java.util.EmptyStackException();
        return stack[top--];
    }
}