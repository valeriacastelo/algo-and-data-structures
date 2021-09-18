package com.example.sorting;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {5,7,2,8,1,13,10,9};

        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length - 1);

        printArray(arr);

    }

    public void sort(int[] arr, int left, int right) {

        if (left < right) {

            int middle = left + (right - left) / 2;

            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            merge(arr, left, middle, right);

        }

    }

    private void merge(int[] arr, int left, int middle, int right) {

        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]

        int nLeft = middle - left + 1;
        int nRight = right - middle;

        int[] arrLeft = new int[nLeft];
        int[] arrRight = new int[nRight];

        //Copy temp arrays
        for(int i = 0; i < nLeft; i++) {
            arrLeft[i] = arr[i + left];
        }

        for(int j = 0; j < nRight; j++) {
            arrRight[j] = arr[j + middle + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < nLeft || j < nRight) {

            if (i < nLeft && j < nRight) {

                if (arrLeft[i] < arrRight[j]) {
                    arr[k] = arrLeft[i];
                    i++;
                } else {
                    arr[k] = arrRight[j];
                    j++;
                }

            } else if (i < nLeft) {
                arr[k] = arrLeft[i];
                i++;

            } else {
                arr[k] = arrRight[j];
                j++;
            }

            k++;

        }

    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
