import java.util.Arrays;

public class InPlaceMergeSort
{
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        MergeSortInPLace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void MergeSortInPLace(int[] arr, int start, int end)
    {
        if((end - start) == 1)
        {
            return;
        }
        int mid = (end + start) / 2;

        MergeSortInPLace(arr, start, mid);
        MergeSortInPLace(arr, mid, end);

        MergeInPlace(arr, start, mid, end);
    }

    private static void MergeInPlace(int[] arr, int start, int mid, int end) {
        int[] merge = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end)
        {
            if(arr[i] < arr[j])
            {
                merge[k] = arr[i];
                i++;
            }
            else {
                merge[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid) {
            merge[k] = arr[i];
            i++;
            k++;
        }
        while(j < end)
        {
            merge[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < merge.length; l++)
        {
            arr[start + l] = merge[l];
        }
    }
}
