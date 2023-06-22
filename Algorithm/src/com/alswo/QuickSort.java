package com.alswo;

// �� ����
public class QuickSort {
	
    public static void quickSort(int[] arr, int low, int high) {
    	
        if (low < high) {
        	
        	// pivotIndex �������� ���� ����
            int pivotIndex = partition(arr, low, high);
            
            // pivotIndex�� ������ �¿� �κ��� ��������� ����
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
    	
    	// �迭�� ���� ������ ��Ҹ� pivot���� ����
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
            	// ���� ��Ұ� �ǹ����� ������ i�� ���� �ش� ��ҿ� i ��ġ�� ��Ҹ� ��ȯ
                i++;
                swap(arr, i, j);
            }
        }
        
        // �ǹ��� �ùٸ� ��ġ�� �̵�
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
    	
        // �� ����� ��ġ�� ��ȯ
    	int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
}
