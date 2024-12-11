import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(2,3);
//        map.put(4,3);
//        map.put(2,6);
//        boolean check = map.containsKey(2);
//        System.out.println(check);
//        System.out.println(map.get(2));

        int[] arr = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2,-9, -6};
        int len = lenOfLongSubarr(arr, arr.length, 15);
        System.out.println(len);
    }
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        //Complete the function

        int maxlen = 0;
        int sum = 0;

        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        for(int i = 0; i< n ; i++)
        {
            sum = sum + arr[i];

            if(sum == k)
            {
                maxlen = Math.max(maxlen, i+1);
            }

            int rem = sum - k;

            if(mpp.containsKey(rem))
            {
                int len = i - mpp.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            if(!mpp.containsKey(rem))
            {
                mpp.put(sum, i);
            }
        }
        return maxlen;
    }
}