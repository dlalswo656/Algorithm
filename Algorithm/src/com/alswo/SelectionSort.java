package com.alswo;

// ���� ����
public class SelectionSort {
	
    public static void selectionSort(int[] arr) {
    	
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
        	// ���� �ε����� �ּҰ� �ε����� ����
            int minIndex = i;
            
            // �ּҰ��� ã�� ���� ���� �ε��� ������ ��� ��Ҹ� ��
            for (int j = i + 1; j < n; j++) {
            	
            	// ���� ��Ұ� �ּ� ������ �۴ٸ� �ּҰ� �ε����� ����
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // �� ����� ��ġ�� ��ȯ�մϴ�.
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

