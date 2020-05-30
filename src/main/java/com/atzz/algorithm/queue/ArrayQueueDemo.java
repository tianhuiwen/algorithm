package com.atzz.algorithm.queue;

import java.util.Scanner;

/**
 * 用数值模拟对列
 *
 * @author tianhuiwen
 * @date 2020/5/30 17:17
 */
public class ArrayQueueDemo {

    public static void main(String[] args) {
        // 测试一把
        // 创建一个队列
        ArrayQueue queue = new ArrayQueue(3);
        // 接收用户输入
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        // 输出一个菜单
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = queue.getQueue();
                        System.out.printf("取出的数据是%d\n", res);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = queue.headQueue();
                        System.out.printf("队列头的数据是%d\n", res);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }

        System.out.println("程序退出~~");
    }


    static class ArrayQueue {

        private int maxSize;

        /**
         * 队列头
         */
        private int front;

        /**
         * 队列尾
         */
        private int rear;

        /**
         * 存放数据，模拟队列
         */
        private int[] arr;

        public ArrayQueue(int maxSize) {
            this.maxSize = maxSize;
            arr = new int[maxSize];
            front = -1;
            rear = -1;
        }

        public boolean isFull() {
            return rear == maxSize - 1;
        }

        public boolean isEmpty() {
            return rear == front;
        }

        public void addQueue(int n) {
            if (isFull()) {
                System.out.println("队列已满");
            }
            rear++;
            arr[rear] = n;
        }

        public int getQueue() {
            if (isFull()) {
                throw new RuntimeException("队列为空");
            }
            front++;
            return arr[front];
        }

        /**
         * 显示队列数据
         */
        public void showQueue() {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("arr[%d]=%d\n", i, arr[i]);

            }
        }

        /**
         * 显示队列的头数据
         */
        public int headQueue() {
            if (isFull()) {
                throw new RuntimeException("队列为空");
            }
            return arr[front + 1];
        }
    }
}
