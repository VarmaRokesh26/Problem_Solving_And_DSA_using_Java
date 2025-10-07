package DataStructuresAndAlgorithms.src.Sorting;

import java.util.Arrays;

public class Sorting {
    
    public void bubbleSort(int[] arr, int n) {
        boolean swapped;
        for(int i=0;i<n-1;i++) {
            swapped = false;
            for(int j=0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
            if(!swapped) break;
        }
    }

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

    public void selectionSort(int[] arr, int n) {
        int minIndex;
        for(int i=0;i<n-1;i++) {
            minIndex = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    public void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;

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
            R[i] = arr[mid+i+1];

        int i=0, j=0, k = left;
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
            arr[k] = R[i];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
 