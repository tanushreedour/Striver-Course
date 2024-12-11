import java.util.Arrays;

public class CountNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,1,2,3,5,3};
        int i = 5;
        int frequency = CountNumbers(i, arr);
        System.out.println("Frequency of "+ i+ " is "+ frequency);
    }
    public static int CountNumbers(int num, int[] arr)
    {
        int[] hash = new int[13];
        for(int i = 0 ; i < arr.length ; i++)
        {
            hash[arr[i]] = hash[arr[i]] + 1;
        }
        return hash[num];
    }
}