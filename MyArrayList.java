package ru.geekbrains;

class MyArrayList<Item extends Comparable<Item>> {
    private int[] arr;
    private int size;

    public MyArrayList(int size){
        this.size = 0;
        this.arr = new int[size];
    }

    public void display(){
        for(int i=0;i<this.size;i++){
            System.out.println(this.arr[i]);
        }
    }

    public void delete(int value){
        int i=0;
        for(i=0;i<this.size;i++){
            if (this.arr[i] == value) break;
        }

        for (int j=i;j<this.size-1; j++){
            this.arr[j] = this.arr[j+1];
        }
        this.size--;
    }

    public void insert(int value){
        this.arr[this.size] = value;
        this.size++;
    }
}

 class Main {
    public static void main(String[] args) {

        MyArrayList arr = new MyArrayList(10);
        arr.insert(5);
        arr.insert(1);
        arr.insert(2);
        arr.insert(5);
        arr.insert(4);
        arr.insert(5);
        arr.insert(6);
        arr.insert(5);
        arr.insert(8);
        arr.insert(9);

        System.out.println("Выводим массив");
        arr.display();
        arr.delete(1);
        System.out.println("Выводим новый массив");
        arr.display();
    }
}



