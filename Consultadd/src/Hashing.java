import java.lang.reflect.Array;
import java.util.Arrays;

public class Hashing {
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,2,1,2};
        int[] hash = new int[10];

        for(int i =0; i < arr.length; i++)
        {
            hash[arr[i]] += 1;
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length ; i++)
        {
            System.out.println(arr[i] + " : " + hash[arr[i]]);
        }
    }
}
