package com.atzz.algorithm.common;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

/**
 * @author tianhuiwen
 * @date 2020/7/16 14:44
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {3, 9, -1, 10, 20};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = true;
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            if (!flag){
                break;
            }else {
                flag = false;
            }
        }

    }
}
