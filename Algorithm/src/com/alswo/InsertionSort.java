package com.alswo;

// ���� ����
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
        	// ���� ��Ҹ� key�� ����
            int key = arr[i];
            int j = i - 1;
            
            // key�� ���� ��ҵ�� ���Ͽ� ������ ��ġ�� ã��
            while (j >= 0 && arr[j] > key) {
            	// ���� ��Ҹ� ���� ��ġ�� �̵�
                arr[j + 1] = arr[j];
                j--;
            }
            
            // key�� ������ ��ġ�� ��ġ
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
