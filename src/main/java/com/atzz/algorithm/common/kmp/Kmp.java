package com.atzz.algorithm.common.kmp;

import java.util.Arrays;

/**
 * @author tianhuiwen
 * @date 2020/7/15 20:50
 */
public class Kmp {

    public static void main(String[] args) {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABD";
        int[] aas = kmpNext("abcab");
        System.out.println(Arrays.toString(aas));


    }

    public static int[] kmpNext(String dest) {
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {
           /* while (dest.charAt(i) != dest.charAt(j)){

            }*/

            if (dest.charAt(i) == dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
