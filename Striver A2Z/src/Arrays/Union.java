package Arrays;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4};
        int[] arr2 = {2,3,4,4,5};
        ArrayList<Integer> list = findUnion(arr1, arr2, arr1.length, arr2.length);
        System.out.println(list);
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(i < n && j < m)
        {
            if(arr1[i] <= arr2[j])
            {
                if(list.size() == 0 || list.get(list.size() - 1) != arr1[i])
                {
                    list.add(arr1[i]);
                }
                else
                {
                    i++;
                }
            }
            else
            {
                if(list.get(list.size() - 1) != arr2[j])
                {
                    list.add(arr2[j]);
                }
                else
                {
                    j++;
                }
            }
        }

        // If one of the array completed traversing
        while(i < n)
        {
            if(list.get(list.size() - 1) != arr1[i])
            {
                list.add(arr1[i]);
            }
            else
            {
                i++;
            }
        }

        while(j < m)
        {
            if(list.get(list.size() - 1) != arr2[j])
            {
                list.add(arr2[j]);
            }
            else
            {
                j++;
            }
        }

        return list;
    }
}
