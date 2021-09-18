package com.example.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {284, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        bubbleSort(numbers);

        for(int n : numbers) {
            System.out.print(n + " ");
        }

    }

    public static void bubbleSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }
}
