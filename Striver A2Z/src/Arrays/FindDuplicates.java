package Arrays;


// Find the number of unique elements ina an array

// 1st approach: We can use a set to store array elements as a set can contain unique elements only and then
//               store the values of set in the array and return the count.


// 2nd approach: In-place searching for unique elements given below:

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int count = findDuplicates(arr);
        System.out.println(count);
    }
    static int findDuplicates(int[] arr)
    {
        int i = 0;

        for(int j = 1; j< arr.length; j++)
        {
            if(arr[i] == arr[j])
            {
                j++;
            }
            else
            {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
