package com.musaahotoro;

public class Stack {
    private int topIndex;
    final private int size;
    final private Coordinate[] items;

    Stack(int size) {
        this.size = size;
        items = new Coordinate[size];
        topIndex = -1;
    }

    public void push(Coordinate item) {
        if(topIndex != size - 1) {
            topIndex++;
            items[topIndex] = item;
        }
    }

    public Coordinate pop() {
        if(topIndex == -1) {
            System.err.println("Stack is Empty");
        }
        Coordinate c = items[topIndex];
        topIndex--;

        return c;
    }

    public Coordinate top() {
        if(topIndex == -1) {
            System.out.println("Stack is Empty");
        }
        return items[topIndex];
    }

    public boolean isEmpty() {
        if(topIndex == -1) {
            return true;
        }
        return false;
    }

    public int getTopIndex() {
        return topIndex;
    }

    public Coordinate getElementAt(int index) {
        return items[index];
    }




}
