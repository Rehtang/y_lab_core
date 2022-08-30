package ru.rehtang.sortArray;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] x = {5, 6, 3, 2, 5, 1, 4, 9};
    quickSort(x,0,7);
    System.out.println(Arrays.toString(x));
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static int partition(int[] arr, int low, int high) {

    int pivot = arr[high];

    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {

      if (arr[j] < pivot) {

        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return (i + 1);
  }

  public static void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
      int partitionIndex = partition(arr, begin, end);

      quickSort(arr, begin, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, end);
    }
  }

}
