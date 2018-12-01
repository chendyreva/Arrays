package ru.geekbrains;

public class MySortedArrayList<Item extends Comparable<Item>> extends MyArrayList<Item> {

    public void insert(Item item) {
        super.insert((Integer) item);
        int i = this.size() - 1;
        while (i > 0 && this.get(i).compareTo(this.get(i - 1)) < 0) {
            Item temp = this.get(i);
            this.set(i, this.get(i - 1));
            this.set(i - 1, temp);
            i--;
        }
    }


    public boolean find(Item item) {
        int low = 0;
        int hi = this.size() - 1;
        while (low <= hi) {
            int mid = low + (hi - low) / 2; //mid = (low + hi) / 2;
            if (item.compareTo(this.get(mid)) < 0) {
                hi = mid - 1;
            }
            else if (item.compareTo(this.get(mid)) > 0) {
                low = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }


    public void sortInsert(Item item){
        int out, in, mark;
        for(out=0;out<this.size;out++){
            mark = out;
            for(in = out+1;in<this.size;in++){
                if (this.arr[in]< this.arr[mark]){
                    mark = in;
                }
            }
            change(out, mark);
        }
    }

    private void change(int out, int mark) {
    }
}
class Main {
    public static void main(String[] args) {
        int size = 100;
        MyArrayList arr = new MyArrayList(size);
        arr.insert( 10);
        arr.insert( 15);
        arr.insert( 15);
        arr.display();

        arr.sortInsert();

        arr.display();
    }
}
