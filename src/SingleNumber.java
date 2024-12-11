// LeetCode- 136
// https://leetcode.com/problems/single-number/description/

public class SingleNumber
{
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,1,2,2};
        int s = Single(arr);
        System.out.println(s);
    }
    static int Single(int[] arr)
    {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
