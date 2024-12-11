import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 78, 4, 4, 6, 3, 2, 4, 8, 2, 4};
        int target = 4;
        System.out.println(SearchLast(arr, target, arr.length - 1));
        System.out.println(SearchList(arr, target, 0, new ArrayList<>()));
        System.out.println(SearchList2(arr, target, 0));
    }
    static int Search(int[] arr, int target, int index)
    {
        // base condition
        if(index == arr.length){
            return -1; // Element not present
        }
        if(arr[index] == target){
            return index;
        }
        return Search(arr, target, index + 1);
    }

    static int SearchLast(int[] arr, int target, int index)
    {
        // base condition
        if(index == 0){
            return -1; // Element not present
        }
        if(arr[index] == target){
            return index;
        }
        return SearchLast(arr, target, index - 1);
    }

    static ArrayList<Integer> SearchList(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return SearchList(arr, target, index + 1, list);
    }

    // Now we are defining a new ArrayList inside the function.

    // It is not a good approach because every time a new object is forming which is taking more space so an optimized
    // approach says that use only one object and pass that object inside the parameters of that function and then use
    // it throughout the end of the array of array and append it sothat only one time the ArrayList got created and
    // space complexity will be equal to the size of ArrayList.

    static ArrayList<Integer> SearchList2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
        {
            return list;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        ArrayList<Integer> ans = SearchList2(arr, target, index + 1);
        list.addAll(ans);
        return list;
    }
}
