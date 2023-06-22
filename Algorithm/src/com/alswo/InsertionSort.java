package com.alswo;

// 삽입 정렬
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
        	// 현재 요소를 key로 성정
            int key = arr[i];
            int j = i - 1;
            
            // key를 이전 요소들과 비교하여 삽입할 위치를 찾음
            while (j >= 0 && arr[j] > key) {
            	// 이전 요소를 현재 위치로 이동
                arr[j + 1] = arr[j];
                j--;
            }
            
            // key를 삽입할 위치에 배치
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {21, 7, 49, 28, 14, 42, 35};
        insertionSort(arr);
        System.out.println("InsertionSort : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
