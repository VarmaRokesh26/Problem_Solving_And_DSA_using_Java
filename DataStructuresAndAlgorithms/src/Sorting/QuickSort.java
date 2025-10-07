package DataStructuresAndAlgorithms.src.Sorting;

import java.util.Arrays;
import java.util.Scanner;
public class QuickSort {
    
    public void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int pivotIndex = partition(arr, left, right);

            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i=left-1;

        for(int j=left;j<right;j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        System.out.println(Arrays.toString(arr));

        return i+1;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        QuickSort QS = new QuickSort();
        QS.quickSort(arr, 0, n-1);

        sc.close();
    }
}
