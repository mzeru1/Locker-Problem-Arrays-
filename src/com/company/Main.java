package com.company;

public class Main {

    public static void main(String[] args) {
        // you have 100 closed lockers
        boolean arr[] = new boolean[100];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j += (i + 1)) {
                arr[j] = !arr[j];

            }
        }
        System.out.println("lockers are remained opened: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                System.out.println((i + 1) + " ");
            }
        }
    }
}