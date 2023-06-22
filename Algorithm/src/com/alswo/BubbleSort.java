package com.alswo;

// 버블 정렬
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// 인접한 두 요소를 비교하고 현재 요소가 다음 요소보다 크면 위치를 바꿈
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	 
    public static void main(String[] args) {
        int[] arr = {12, 6, 21, 3, 9, 18, 15};
        bubbleSort(arr);
        System.out.println("BubbleSort : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
