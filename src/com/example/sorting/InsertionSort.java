package com.example.sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {284, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        insertionSort(numbers);

        for(int n : numbers) {
            System.out.print(n + " ");
        }

    }

    public static void insertionSort(int[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {

                if (arr[i] < arr[j]) {
                    //swap
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }

            }
        }
    }
}
