public class RotatedBinarySearch
{
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2};
        int target = 7;
        System.out.println(RotatedBS(arr, target, 0, arr.length - 1));
    }
    static int RotatedBS(int[] arr, int target, int start, int end)
    {
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid])
        {
            if(target >= arr[mid] && target <= arr[mid])
            {
                return RotatedBS(arr, target, start, mid - 1);
            }
            else
            {
                return RotatedBS(arr, target, mid +  1, end);
            }
        }
        else
        {
            if(target >= arr[start] && target >= arr[mid])
            {
                return RotatedBS(arr, target, start, mid - 1);
            }
            else
            {
                return RotatedBS(arr, target, mid + 1, end);
            }
        }
    }
}
