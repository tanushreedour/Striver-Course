package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        bubble(arr);
    }
    static void bubble(int[] arr)
    {
        int temp;
        int n = arr.length;

        for(int i = 0; i <= n-2; i++)
        {
            for(int j = 0; j <= n-i-2; j++)
            {
                if(arr[j+1] < arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // Print the array
        System.out.println(Arrays.toString(arr));
    }
}
