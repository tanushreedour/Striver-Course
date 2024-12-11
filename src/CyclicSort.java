import java.util.Arrays;

public class CyclicSort
{
    public static void main(String[] args) {
        int[] arr = {5,6,3,4,2,1};
        Cyclic_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclic_Sort(int[] arr)
    {
//        for(int i=0;i<arr.length;i++)
//        {
//            while(arr[i]!=i+1)
//            {
//                swap(arr, i,arr[i]-1);
//            }
//        }
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i, correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
