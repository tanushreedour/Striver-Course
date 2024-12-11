import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,13,2,1,8,5,7};
        reverseArray(arr, 1, arr.length - 2);
    }
    static void reverseArray(int[] arr, int start, int end)
    {
        if(start<0 || end>arr.length || start>end)
        {
            return;
        }
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
