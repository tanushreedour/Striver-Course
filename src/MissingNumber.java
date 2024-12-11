public class MissingNumber
{
    /*
    This is also a correct solution with Cyclic Sort

    public static void main(String[] args) {
        int[] arr = {0,2,1,4};
        int m = missing(arr);
        System.out.println(m);
    }
    static int missing(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]<arr.length && arr[i] != arr[arr[i]])
            {
                swap(arr, i, arr[i]);
            }
            else{
                i++;
            }
        }
        for(int index = 0 ; index < arr.length ; index++)
        {
            if(arr[index]  !=index)
            {
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    */
    public static void main(String[] args) {
        int[] arr = {0,2,4,3};
        int m = missing(arr);
        System.out.println(m);
    }
    static int missing(int[] arr)
    {
        /*
        int arrSum = 0;
        for (int n:arr) {
            arrSum = arrSum + n;
        }
        int total = 0;
        for (int i = 0; i <= arr.length; i++) {
            total = total + i;
        }
        return total - arrSum;
        */

        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        for (int i : arr) {
            sum = sum - i;
        }
        return sum;
    }
}
