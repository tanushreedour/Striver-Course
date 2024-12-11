package Arrays;

import java.util.*;

public class LongestSubsequence
{
    public static void main(String[] args) {
        int[] arr = {15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8 ,12, 17, 16, 6, 26, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = longestSuccessiveElements(arr);
        System.out.println(n);
    }
    public static int longestSuccessiveElements(int []a) {
        Arrays.sort(a);
        // Write your code here.
        int smaller = a[0];
        int cnt = 1;
        int larger = cnt;

        for(int i =1; i< a.length; i++)
        {
            if(a[i] == smaller + 1)
            {
                smaller = a[i];
                cnt = cnt + 1;
            }
            else if(a[i] == smaller)
            {

            }
            else if(a[i] != smaller + 1)
            {
                larger = Math.max(larger, cnt);
                cnt = 1;
                smaller = a[i];
            }
        }
        larger = Math.max(larger, cnt);
        return larger;
    }
}