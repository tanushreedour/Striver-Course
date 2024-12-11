import java.util.Arrays;

public class Sorting
{
    public static void main(String[] args) {
        int[] arr= {4,7,2,3,6,1,5};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    // In case of numbers in range [0,n], and want to sort the array or you want to find a missing element
    // then use Cyclic Sort as it gives the time complexity O(n) and Space complexity O(1)
    // This is the main hint in solving any question which requires constant space complexity and
    // linear time complexity.
    static void CyclicSort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }
    static void insertion(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void bubble(int[] arr)
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped = false;
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                swapped = true;
            }
            if(swapped == false)
            {
                break;
            }
        }
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void selection(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last = arr.length-i-1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, last, max);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end)
    {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        return max;
    }
}
