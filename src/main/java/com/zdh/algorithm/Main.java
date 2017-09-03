package com.zdh.algorithm;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        String str = valid(3,arr);
        System.out.println(str);
    }
    
    public static String valid(int a, int[] arr) {
        for(int i = arr.length-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        for(int i = 1; i<arr.length-1; i++) {
            int res = arr[1] - arr[0];
            if (arr[i + 1] - arr[i] != res) {
                return "Impossible";
            } 
        }
        return "Possible";
    }
}
