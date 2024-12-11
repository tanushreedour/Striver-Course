import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Example
{
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,2,5,6,3,7,8};
        System.out.println(findDisappearedElements(arr));
    }
    static List<Integer> findDisappearedElements(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct])
            {
                swap(arr, i , correct);
            }
            else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
