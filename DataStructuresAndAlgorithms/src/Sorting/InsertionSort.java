package DataStructuresAndAlgorithms.src.Sorting;

import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    
    public void insertionSort(int[] arr, int n) {
        for(int i=1;i<n;i++) {
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        InsertionSort IS = new InsertionSort();
        IS.insertionSort(arr, n);
        sc.close();
    }
}
