import java.util.Arrays;

public class SelectionSortRecursion
{
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int row, int col, int max)
    {
        if(row == 0)
        {
            return;
        }
        if(col < row)
        {
            if(arr[col] > arr[max])
            {
                max = col;
                selection(arr, row, col+1, max);
            }
            else{
                selection(arr, row, col+1, max);
            }
        }
        else {
            // swap max element with the last item
            int temp = arr[row-1];
            arr[row-1] = arr[max];
            arr[max] = temp;

            selection(arr, row-1, 0, 0);
        }
    }
}
