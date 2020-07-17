package com.atzz.algorithm.common;

import java.util.Arrays;

/**
 * 希尔排序
 *
 * @author tianhuiwen
 * @date 2020/7/16 20:54
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {3, 9, 10, 5, -1, 4, 23, 2};
        shellSort(array);
    }

    public static void shellSort(int[] array) {
        int gap = array.length / 2;
        while (gap > 0) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[i] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        System.out.println(Arrays.toString(array));
    }

}
