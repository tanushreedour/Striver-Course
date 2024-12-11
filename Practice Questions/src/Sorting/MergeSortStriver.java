package Sorting;

import java.util.Arrays;

public class MergeSortStriver {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        mergeSort(arr, 0, arr.length-1);
    }
    static void mergeSort(int[] arr, int low, int high)
    {
        // If a single element remains in the array then its low and high will be equal
        if(low == high)
        {
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    static void merge(int[] arr, int low, int mid, int high)
    {
        int left = low;
        int right = mid+1;
        int k=0;
        int[] merge = new int[arr.length];
        while((left <= mid) && (right <= high))
        {
            if(arr[left] <= arr[right])
            {
                merge[k] = arr[left];
                left++;
                k++;
            }
            else {
                merge[k] = arr[right];
                right++;
                k++;
            }
        }
        // If some elements of an array are left and another array is completely included in the merged array then this concept will work.
        while(left <= mid)
        {
            merge[k] = arr[left];
            left++;
            k++;
        }
        while(right <= high)
        {
            merge[k] = arr[right];
            right++;
            k++;
        }

        // Copy merge into arr
        for(int i = 0; i < merge.length ; i++)
        {
            arr[i] = merge[i];
        }
        // Print the merged array
        // System.out.println(Arrays.toString(arr));
    }
}
