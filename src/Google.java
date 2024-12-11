// Google Question
// Date: 05-02-2024
// Bitwise Operators video of Kunal Kushwah

import java.lang.reflect.Array;
import java.util.Arrays;

public class Google
{
    public static void main(String[] args) {
        int[][] arr = {{1,1,0}, {0,1,1}, {1,0,1}};
        for(int[] row : arr){
            for(int i = 0 ; i < (arr[0].length+1)/2 ; i++){
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length-i-1] ^ 1;
                row[arr[0].length-i-1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
