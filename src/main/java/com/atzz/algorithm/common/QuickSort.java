package com.atzz.algorithm.common;

import java.util.Arrays;

/**
 * @author tianhuiwen
 * @date 2020/7/16 21:55
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 9, 10, 2, -2, -10, 100, 33};
        int mid = partition(array, 0, array.length - 1);
        partition(array, 0, mid);
        partition(array, mid + 1, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static int partition(int[] array, int left, int right) {
        int tmp = array[left];
        while (right > left) {
            while (right > left && array[right] >= tmp) {
                right--;
            }
            if (right > left) {
                array[left] = array[right];
                left++;
            }
            while (right > left && tmp > array[left]) {
                left++;
            }
            if (right > left) {
                array[right] = array[left];
                right--;
            }
        }
        array[left] = tmp;
        return left;
    }

}
