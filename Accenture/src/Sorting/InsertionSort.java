package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,5,6,2,1,6};
        for(int i =0; i<arr.length-1;i++)
        {
            for(int j = i+1; j >0 ; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                else {
                    break;
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

