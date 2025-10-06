package DataStructuresAndAlgorithms.src.Sorting;

import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    
    public void bubbleSort(int[] arr, int n) {
        boolean swapped;
        for(int i=0;i<n-1;i++) {
            swapped = false;
            for(int j=0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            System.out.println(Arrays.toString(arr));
            if(!swapped) break;
        }
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        
        BubbleSort BS = new BubbleSort();
        BS.bubbleSort(arr, n);

        sc.close();
    }
}
