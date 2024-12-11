public class SearchRBS2
{
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
    static boolean search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid]>=nums[start])
            {
                if(target == nums[mid])
                {
                    return true;
                }
                start++;
            }
            if(nums[mid]>=nums[end]) {
                if (target == nums[mid]) {
                    return true;
                }
                end--;
            }
        }
        return false;
    }
}
