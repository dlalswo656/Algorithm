package com.alswo;

// ���� ����
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// ������ �� ��Ҹ� ���ϰ� ���� ��Ұ� ���� ��Һ��� ũ�� ��ġ�� �ٲ�
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