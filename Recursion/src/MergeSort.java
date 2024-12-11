import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args) {
        int[] arr = {3, 56, 1, 87, 34, 2, 9, 90};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] main = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                main[k] = first[i];
                i++;
            }
            else{
                main[k] = second[j];
                j++;
            }
            k++;
        }
        // Let's suppose one of the array completed in comparison and another array remains to be traversed.
        while(i < first.length)
        {
            main[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length)
        {
            main[k] = second[j];
            j++;
            k++;
        }
        return main;
    }
}