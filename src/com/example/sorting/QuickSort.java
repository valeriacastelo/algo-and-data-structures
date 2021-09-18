package com.example.sorting;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5,7,2,8,1,13,10,9};

        QuickSort ms = new QuickSort();
        ms.sort(arr, 0, arr.length - 1);

        printArray(arr);

    }

    public void sort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);

        }

    }

    /* This function takes last element as pivot,
       places all smaller to left of pivot and places
       the pivot element at its correct position */
    private int partition(int[] arr, int low, int high) {

        //get the pivot as the last element
        int pivot = arr[high];
        int j = low;

        for (int i = low; i < high; i++) {

            if (arr[i] < pivot) {

                swap(arr, i, j);
                j++;

            }
        }

        swap(arr, j, high);

        return j;

    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
