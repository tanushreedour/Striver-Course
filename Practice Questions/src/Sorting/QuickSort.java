package Sorting;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        qs(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void qs(int[] arr, int low, int high)
    {
        // Base condition
//        if(low == high)
//        {
//            return;
//        }
        if(low < high)
        {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex);
            qs(arr, pIndex + 1, high);
        }
    }
    static int partition(int[] arr, int low, int high)
    {
        int i = low;
        int j = high;

        int pivot = low;

        while(i < j)
        {
            // Find larger number than pivot
            while(arr[i] <= arr[pivot] && i < high)
            {
                i++;
            }
            // Find a number larger than pivot
            while(arr[j] > arr[pivot] && j > low)
            {
                j--;
            }
            if(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // when i and j crosses, swap pivot element with the (j)th element
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;

        return j;
    }
}
