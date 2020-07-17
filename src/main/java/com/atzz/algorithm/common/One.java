package com.atzz.algorithm.common;

/**
 * 二分查找非递归
 *
 * @author tianhuiwen
 * @date 2020/7/14 20:35
 */
public class One {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 23, 45};
        int i = find(arr, -1);
        if (i == -1) {
            System.out.println("没有匹配的数据");
        } else {
            System.out.println("下标为：" + i);
        }
    }

    public static int find(int[] arr, int tagert) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (tagert == arr[mid]) {
                return mid;
            } else if (tagert > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
