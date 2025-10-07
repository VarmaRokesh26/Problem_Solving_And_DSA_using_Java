package DataStructuresAndAlgorithms.src.Sorting;

import java.util.Scanner;
import java.util.Arrays;
public class SelectionSort {
    
    public void selectionSort(int[] arr, int n) {
        int minIndex;
        for(int i=0;i<n-1;i++) {
            minIndex = i;

            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        SelectionSort SS = new SelectionSort();
        SS.selectionSort(arr, n);

        sc.close();
    }
}
