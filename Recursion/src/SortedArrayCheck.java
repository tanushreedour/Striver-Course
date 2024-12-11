import java.util.Arrays;

public class SortedArrayCheck
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr) + " is sorted : " + ArrayCheck(arr, 0));
    }
    static boolean ArrayCheck(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return (arr[index] < arr[index + 1]) && ArrayCheck(arr, index + 1);
    }
}
