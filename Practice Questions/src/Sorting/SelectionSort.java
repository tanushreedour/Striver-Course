package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,2,4,5,1,3,6,8,4,9, 89, 1, 45, 67, 34, 56};
        selection_sort(arr);
    }
    static void selection_sort(int[] arr)
    {
        int n = arr.length;
        int min, temp;

        for(int i = 0; i <= n-2 ; i++)
        {
            min = i;
            for(int j = i+1; j <= n-1 ; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        // Print sorted array
        for(int i =0; i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
