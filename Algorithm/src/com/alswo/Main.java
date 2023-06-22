package com.alswo;

public class Main {
    public static void main(String[] args) {
    	
        int[] arr = {4, 10, 2, 6, 8};
        
       
        // QuickSort 클래스의 quickSort 메서드를 호출
        // 퀵 정렬을 사용하여 배열 정렬
        QuickSort.quickSort(arr, 0, arr.length - 1);

        System.out.println("QuickSort : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
