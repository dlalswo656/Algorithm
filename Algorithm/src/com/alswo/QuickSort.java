package com.alswo;

// 퀵 정렬
public class QuickSort {
	
    public static void quickSort(int[] arr, int low, int high) {
    	
        if (low < high) {
        	
        	// pivotIndex 기준으로 분할 정렬
            int pivotIndex = partition(arr, low, high);
            
            // pivotIndex을 제외한 좌우 부분을 재귀적으로 정렬
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
    	
    	// 배열의 가장 오른쪽 요소를 pivot으로 선택
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
            	// 현재 요소가 피벗보다 작으면 i를 증가 해당 요소와 i 위치의 요소를 교환
                i++;
                swap(arr, i, j);
            }
        }
        
        // 피벗을 올바른 위치로 이동
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
    	
        // 두 요소의 위치를 교환
    	int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
}
