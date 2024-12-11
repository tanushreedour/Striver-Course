// Find largest element in an array

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,7,9,3,90,7,8,90, 9};
        int largest = largest(arr);
        System.out.println("Largest element in an array is : " + arr[largest]);
        int second = second(arr);
        System.out.println("Second largest element in the given array is : "+ arr[second]);

        int[] arr2 = {1,2,3,4,5};
        boolean ans = isSorted(arr2);
        System.out.println(ans);
    }
    static int largest(int[] arr)
    {
        int max = 0;
        for(int i = 1; i< arr.length; i++)
        {
            if(arr[i] > arr[max])
            {
                max = i;
            }
            i++;
        }
        return max;
    }

    static int second(int[] arr)
    {
        int max = 0;
        int second = 0;

        for(int i =0; i< arr.length; i++)
        {
            if(arr[i] > arr[max])
            {
                second = max;
                max = i;
            }
        }

        return second;
    }

    // Check if the array is sorted
    static boolean isSorted(int[] arr)
    {
        // ascending
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}