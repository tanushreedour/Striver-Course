package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        count(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void count(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
