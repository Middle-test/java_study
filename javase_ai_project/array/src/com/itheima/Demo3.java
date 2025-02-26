package com.itheima;

public class Demo3 {
    public static void main(String[] args) {
        test1(5);
    }

    public static void test1(int length) {
        int arr[][] = new int[length][length];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        printArr(arr);
        System.out.println("=====================");
        //打乱二维数组中元素位置
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int randomRow = (int) (Math.random() * arr.length);
                int randomCol = (int) (Math.random() * arr[i].length);
                int temp = arr[i][j];
                arr[i][j] = arr[randomRow][randomCol];
                arr[randomRow][randomCol] = temp;
            }
        }
        printArr(arr);
    }

    public static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}