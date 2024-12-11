package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,5,6,7,3,2};

        for(int i = 0; i< arr.length; i++)
        {
            int last = arr.length-i-1;
            int maxIndex = maxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        System.out.println(Arrays.toString(arr));
    }
    static int maxIndex(int[] arr, int start, int end)
    {
        int max = start;
        for(int i =start; i<end;i++)
        {
            if(arr[i]>arr[max])
            {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
