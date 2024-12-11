package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        insertion(arr, arr.length);
    }
    static void insertion(int[] arr, int n)
    {
        for(int i =0 ; i <= n-1; i++)
        {
            int j = i;

            while(j > 0 && arr[j-1] > arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }
}
