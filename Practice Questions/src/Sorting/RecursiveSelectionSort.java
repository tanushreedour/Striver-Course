package Sorting;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        selection(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int i, int j, int max)
    {
        // Base condition
        if(i == 0)
        {
            return;
        }

        // To find the maximum element in the array
        if(j <= i)
        {
            if(arr[j] > arr[max])
            {
                max = j;
            }
            selection(arr, i, j+1, max);
        }
        else
        {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            selection(arr, i-1, 0, 0);
        }
    }
}
