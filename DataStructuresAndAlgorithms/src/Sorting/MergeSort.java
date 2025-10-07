package DataStructuresAndAlgorithms.src.Sorting;

import java.util.Scanner;
import java.util.Arrays;
public class MergeSort {
    
    public void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1], R = new int[n2];
        for(int i=0;i<n1;i++)
            L[i] = arr[left+i];
        for(int i=0;i<n2;i++) 
            R[i] = arr[mid+1+i];

        int i = 0, j = 0, k = left;
        while(i<n1 && j<n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1) {
            arr[k] = L[i];
            i++;
            k++;
        } 
        while(j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        MergeSort MS = new MergeSort();
        MS.mergeSort(arr, 0, n-1);

        sc.close();
    }
}
