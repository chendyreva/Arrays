package ru.geekbrains;

import jdk.jshell.spi.ExecutionControl;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyArrayDeque<Item extends Comparable<Item>>  {
    private Object[] queue = new Object[2];
    private int size = 0;
    private int start = 0;// 1 элемент
    private int end = 0;// место вставки последнего
    LinkedList _items = new LinkedList();

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return  size == 0;
    }
    private void resize(int capacity) {
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = queue[(start + i) % size];
        }
        queue = temp;
        start = 0;
        end = size;


        public void EnqueueFirst (T value)
        {
            throw new ExecutionControl.NotImplementedException();
        }

        public void EnqueueLast (T value)
        {
            throw new ExecutionControl.NotImplementedException();
        }

        public T DequeueFirst ()
        {
            throw new ExecutionControl.NotImplementedException();
        }

        public T DequeueLast ()
        {
            throw new ExecutionControl.NotImplementedException();
        }

        public T PeekFirst ()
        {
            throw new ExecutionControl.NotImplementedException();
        }

        public T PeekLast ()
        {
            throw new ExecutionControl.NotImplementedException();
        }

        public int Count {
        }
    }

