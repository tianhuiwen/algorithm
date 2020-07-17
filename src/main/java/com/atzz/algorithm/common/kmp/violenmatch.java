package com.atzz.algorithm.common.kmp;

/**
 * @author tianhuiwen
 * @date 2020/7/14 23:36
 */
public class violenmatch {

    public static void main(String[] args) {

        String s1 = "米老鼠蚂蚁zz";
        String s2 = "蚂蚁d";
        int match = match(s1, s2);
        System.out.println(match);

    }

    public static int match(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int s1len = chars1.length;
        int s2len = chars2.length;
        int i = 0;
        int j = 0;
        while (i < s1len && j < s2len) {
            if (chars1[i] == chars2[j]) {
                j++;
                i++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == s2len) {
            return i - j;
        } else {
            return -1;
        }
    }
}
