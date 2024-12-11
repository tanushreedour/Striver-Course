import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 1, 7};
        Bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
//    static int[] Bubble(int[] arr, int index)
//    {
//        // Boundary case
//        if(index == arr.length -1 )
//        {
//            return arr;
//        }
//
//        if(arr[index] < arr[index + 1])
//        {
//            return Bubble(arr, index + 1);
//        }
//        else{
//            int temp = arr[index];
//            arr[index] = arr[index + 1];
//            arr[index + 1] = temp;
//            return Bubble(arr, index + 1);
//        }
//    }

    static void Bubble(int[] arr, int row, int col)
    {
        if(row == 0)
        {
            return;
        }
        if(col < row)
        {
            if(arr[col] > arr[col+1])
            {
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            Bubble(arr, row, col + 1);
        }
        else{
            Bubble(arr, row - 1, 0);
        }
    }
}
