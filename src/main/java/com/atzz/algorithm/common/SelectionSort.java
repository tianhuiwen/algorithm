package com.atzz.algorithm.common;

import java.util.Arrays;

/**
 * @author tianhuiwen
 * @date 2020/7/16 17:03
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, -2, 46, 4, 19, 50, 48};
        selectionSort(array);
    }

    public static void selectionSort(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
