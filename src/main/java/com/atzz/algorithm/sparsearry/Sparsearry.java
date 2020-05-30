package com.atzz.algorithm.sparsearry;

/**
 * 稀疏数组代码实现
 *
 * @author tianhuiwen
 * @date 2020/5/30 14:21
 */
public class Sparsearry {

    public static void main(String[] args) {
        // 原始二维数组 11 * 11
        // 0: 表示没有棋子，1 黑子，2 蓝子
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        System.out.println("原始二维数组");
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        // 转稀疏数组
        // 1.遍历原始数据，获取有效数据的个数 sum；
        int sum = 0;
        for (int[] value : chessArr1) {
            for (int anInt : value) {
                if (anInt != 0) {
                    sum++;
                }
            }
        }

        // 2.新建一个二维数组 int[][] sparsearry = int[sum+1][3]   row col val
        int[][] sparsearry = new int[sum + 1][3];
        // 3.存入数据到稀疏数组
        sparsearry[0][0] = 11;
        sparsearry[0][1] = 11;
        sparsearry[0][2] = sum;
        int count = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[i].length; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparsearry[count][0] = i;
                    sparsearry[count][1] = j;
                    sparsearry[count][2] = chessArr1[i][j];
                }
            }
        }

        System.out.println("稀疏数组");
        for (int[] ints : sparsearry) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }

        System.out.println("稀疏数组------还原二维数组");
        int[][] chessArr2 = new int[sparsearry[0][0]][sparsearry[0][1]];
        for (int i = 1; i < sparsearry.length; i++) {
            for (int j = 0; j < sparsearry[i].length; j++) {
                chessArr2[i][i+1]=sparsearry[i][sparsearry[j].length-1];
            }
        }

        for (int[] ints : chessArr2) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }
    }
}

