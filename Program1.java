package ru.geekbrains;
public class Program {
    public static void main(String[] args) {
        MyArrayStack<Integer> st = new MyArrayStack<>();
        st.push(5);
        st.push(3);
        st.push(8);
        st.push(7);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.peek());
        st.push(8);
        System.out.println(st.peek());
        System.out.println(st);

    }
}
