package ru.rehtang.multidimensionalArray;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
  public static void main(String[] args) {
    int[][] array = new int[10][10];
    for (int i = 0; i <= 9; i++) {
      for (int j = 0; j <= 9; j++) {

        array[i][j] = ThreadLocalRandom.current().nextInt(0, 4999);
      }
    }
    var min = array[0][0];
    var max = array[0][0];
    var average = 0;
    for (int i = 0; i <= 9; i++) {
      for (int j = 0; j <= 9; j++) {
        if (min > array[i][j]) min = array[i][j];
        if (max < array[i][j]) max = array[i][j];
        average+=array[i][j];
      }
      }
    System.out.println(max);
    System.out.println(min);
    System.out.println(average/100);
  }
}
