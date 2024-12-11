public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {23, 34, 45, 56, 67, 78, 89, 90, 93};
        int target=78;
        System.out.println(BinarySearch(arr, target, 0, arr.length-1));
    }
    static int BinarySearch(int[] arr, int target, int start, int end)
    {
        if(start > end){
            return -1;  // -1 means the element is not present in the array
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target)
        {
            return mid;
        }
        else if(arr[mid] > target)
        {
            return BinarySearch(arr, target, start, mid-1);
        }
        return BinarySearch(arr, target, mid+1, end);
    }
}
