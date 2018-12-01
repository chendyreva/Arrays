package ru.geekbrains;

public class Program {

    public static void main(String[] args) {
            int[] arr = {27,33,333,400,200,600,800,20,7,4,3,2};
        int i;
        int len = arr.length;
        int search = 5;

///////////////1 delete
        System.out.println("Выводим массив");
        for(int j = 0; j < len; j++){
            System.out.println(arr[j]);
        }

        System.out.println("Поиск искомого элемента");
        for(i = 0;i < len;i++){
            if (arr[i] == search) break;
        }
        System.out.println("Сдвиг всех элементов на 1 шаг влево");
        for (int j = i; j<len-1; j++){
            arr[j] = arr[j+1];
        }
        len--;

        System.out.println("Вывод массива с удаленным элементом");
        for(int j = 0; j < len; j++){
            System.out.println(arr[j]);
        }

////////////////1 выводим 1000000 массив
//        for(int i = 0;i < 1000000;i++) {
//            System.out.println(arr[i]);
 //       }
    }
}
