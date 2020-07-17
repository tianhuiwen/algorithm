package com.atzz.algorithm.common;

import java.util.Arrays;

/**
 * @author tianhuiwen
 * @date 2020/7/16 17:32
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {3, 9, 10, 5, 10, 20, 6};
        insertionSort(array);

    }

    public static void insertionSort(int[] array) {
        int insertNum;
        for (int i = 1; i < array.length; i++) {
            insertNum = array[i];
            int j = i - 1;
            while (j >= 0 && insertNum < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = insertNum;
        }
        System.out.println(Arrays.toString(array));
    }
}
