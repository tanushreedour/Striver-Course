package Arrays;

import java.util.Arrays;

class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;

        for(int i = n-2; i >= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                index = i;
                break;
            }
        }
        if(index == -1)  // It means the array is sorted in descending order and the given array 
        {
            reverse(nums, 0, n-1);
            return;
        }
        for(int i = n-1; i> index ; i--)
        {
            if(nums[i] > nums[index])
            {
                swap(nums, i, index);
                break;
            }
        }
        if(index+1 != n-1)
        {
            reverse(nums, index+1, n-1);
        }
    }
    static void reverse(int[] arr, int start, int end)
    {
        while(start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}