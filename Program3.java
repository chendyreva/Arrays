package ru.geekbrains;
public class Program {
    public static void main(String[] args) {
    MyArrayQueue<Integer> q = new MyArrayQueue<>();
        q.enqueue(7);
        q.enqueue(6);
        q.enqueue(3);
        q.enqueue(18);
        q.enqueue(11);
        System.out.println(q);
        System.out.println(q.peekFront());
        q.dequeue();
        q.dequeue();
        System.out.println(q.peekFront());
        System.out.println(q);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.isEmpty());

    }
}
