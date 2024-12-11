package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,2};
        optimizedLeftRotation(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    // Left rotate an array by one place
    static void leftrotate(int[] arr)
    {
        int n = arr.length;
        int temp = arr[0];

        for(int i =1 ; i < n; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    // Left rotate an array by D places
    static void leftrotate2(int[] arr, int d)
    {
        int n = arr.length;
        int[] temp = new int[d];

        // For storing values till 'd'
        for(int i = 0; i<d ; i++)
        {
            temp[i] = arr[i];
        }
        // For shifting array elements in-place
        for(int i = d ; i < n ; i++)
        {
            arr[i-d] = arr[i];
        }
        // For adding the previously stored values
        for(int i = n-d, j=0 ; i < n; i++)
        {
            arr[i] = temp[j++];
        }
    }

    // Left rotate by 'D' places without using extra space
    static void optimizedLeftRotation(int[] arr, int d)
    {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(int[] arr, int start, int end)
    {
        while(start <= end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
        return;
    }
    static void swap(int[] arr, int first, int second)
    {
        int t = arr[first];
        arr[first] = arr[second];
        arr[second] = t;
    }

    static void rotateright(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[k];

        // For storing values till 'd'
        for(int i = 0, j = n - k ; j < n ; j++)
        {
            temp[i++] = nums[j];
        }
        // For shifting array elements in-place
        for(int i = k ; i < n ; i++)
        {
            nums[i] = nums[i-k];
        }
        // For adding the previously stored values
        for(int i = 0 ; i < k; i++)
        {
            nums[i] = temp[i];
        }
    }
}
