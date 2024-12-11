package Sorting;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,7};
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 1; j < arr.length - i; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr, j, j-1);

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
