package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        if (arr.length == 0) return 0;
        long sum = 1;
        for (int element : arr) {
            sum *= element;
        }
        return sum;
    }

}