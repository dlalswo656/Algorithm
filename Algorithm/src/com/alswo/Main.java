package com.alswo;

public class Main {
    public static void main(String[] args) {
    	
        int[] arr = {4, 10, 2, 6, 8};
        
       
        // QuickSort Ŭ������ quickSort �޼��带 ȣ��
        // �� ������ ����Ͽ� �迭 ����
        QuickSort.quickSort(arr, 0, arr.length - 1);

        System.out.println("QuickSort : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
