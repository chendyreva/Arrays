package ru.geekbrains;

import java.util.NoSuchElementException;

public class MyArrayQueue<Item extends Comparable<Item>> {
    private Object[] queue = new Object[2];
    private int size = 0;
    private int start = 0;// 1 элемент
    private int end = 0;// место вставки последнего

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return  size == 0;
    }

    private void resize(int capacity){
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = queue[(start + i) % size];
        }
        queue = temp;
        start = 0;
        end = size;
    }
    public void enqueue(Item item) {
        if (size == queue.length) {
            resize(2 * queue.length);
        }
        queue[end++] = item;
        end %= queue.length;
        size++;
    }

    public Item dequeue() {
        if (isEmpty()) {
           throw new NoSuchElementException();
        }
        Item item = (Item) queue[start];
        size--;
        start++;
        start %= queue.length;
        if(size > 0 && size == queue.length / 4) {
            resize( queue.length / 2);
        }
        return item;
    }
    public Item peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (Item) queue[start];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = start; i < end; i = (i + 1) % queue.length) {
            s = s + queue[i] + ", ";
        }
        return s;
    }
}
