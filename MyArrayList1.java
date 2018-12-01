package ru.geekbrains;

class MyArrayList<Item extends Comparable<Item>> {
    private int[] arr;
    private int size;

    public MyArrayList(int size){
        this.size = 0;
        this.arr = new int[size];
    }

    public boolean binaryFind(int value){
        int low = 0;
        int high = this.size-1;
        int mid;
        while(low<high){
            mid = (low+high)/2;
            if (value == this.arr[mid]){
                return true;
            }
            else {
                if (value < this.arr[mid]){
                    high = mid;
                } else {
                    low = mid+1;
                }
            }
        }
        return false;
    }

    public boolean find(int value){
        int i;
        for(i=0;i<this.size;i++){
            if (this.arr[i] == value) break;
        }
        if (i==this.size)
            return false;
        else
            return true;
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
        int i;
        for(i=0;i<this.size;i++){
            if (this.arr[i]>value)
                break;
        }
        for(int j=this.size;j>i;j--){
            this.arr[j] = this.arr[j-1];
        }
        this.arr[i] = value;
        this.size++;
    }

}

class Main {
    public static void main(String[] args) {

        MyArrayList arr = new MyArrayList(10);
        arr.insert(-10);
        arr.insert(45);
        arr.insert(26);
        arr.insert(20);
        arr.insert(25);
        arr.insert(40);
        arr.insert(75);
        arr.insert(80);
        arr.insert(82);
        arr.insert(91);

        int search = -10;


        System.out.println(arr.binaryFind(search));
    }
}



