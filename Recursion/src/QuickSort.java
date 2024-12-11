import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSortInPlace(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSortInPlace(int[] arr, int low, int high)
    {
        if(low >= high)
        {
            return;
        }
        int start = low;
        int end = high;

        int mid = start + (end - start) / 2;

        int pivot = arr[mid];

        while(start <= end)
        {
            while(arr[start] < pivot)
            {
                start++;
            }
            while(arr[end] > pivot)
            {
                end--;
            }
            if(arr[start] >= arr[end])
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // Now my pivot element is at it's correct position then we need to call QuickSort once more to
        // sort the LHS and RHS part individually.

        QuickSortInPlace(arr, low, end);
        QuickSortInPlace(arr, start, high);
    }
}
