package com.example.sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {2, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2};
        selectionSort(numbers);

        for(int n : numbers) {
            System.out.print(n + " ");
        }

    }

    public static void selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {

            int minIdx = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            //swap
            System.out.println(("swap " + i + " " + minIdx));
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;

        }
    }
}
