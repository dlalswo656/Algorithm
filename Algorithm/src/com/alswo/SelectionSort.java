package com.alswo;

// 선택 정렬
public class SelectionSort {
	
    public static void selectionSort(int[] arr) {
    	
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
        	// 현재 인덱스를 최소값 인덱스로 설정
            int minIndex = i;
            
            // 최소값을 찾기 위해 현재 인덱스 이후의 모든 요소를 비교
            for (int j = i + 1; j < n; j++) {
            	
            	// 현재 요소가 최소 값보다 작다면 최소값 인덱스를 갱신
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // 두 요소의 위치를 교환합니다.
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
    	
        int[] arr = {100, 10, 5, 25, 30, 15, 20};
        
        selectionSort(arr);
        
        System.out.println("SelectionSort : ");
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

