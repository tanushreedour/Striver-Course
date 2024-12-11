package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Sorting.CountSort;

// An array is given in sorted order from [1,n], you have to find the missing element
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8, 10,2,1,3};
        CountSort.count(arr);
        List<Integer> missing = missing3(arr);
        System.out.println("Missing number in "+ Arrays.toString(arr) + " is: " + missing);
    }
    static int missing(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] -1 ;
            if(arr[i] != arr[correct])
            {
                return i+1;
            }
            else{
                i++;
            }
        }
        return i+1;
    }

    // Alternate solution
    static int missing2(int[] arr)
    {
        int n = arr[arr.length-1];
        int sum = (n*(n+1)) / 2;
        for(int i: arr)
        {
            sum = sum - i;
        }
        return sum;
    }


    // Find all the missing numbers in an array
    static List<Integer> missing3(int[]arr)
    {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(i < arr.length)
        {
            if(arr[i] != i+1)
            {
                list.add(i+1);
            }
            i++;
        }
        return list;
    }
}
