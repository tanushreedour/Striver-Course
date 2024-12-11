package Strings;

import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        outerList.add(new ArrayList<>());
        for(int num : arr) {
            int n = outerList.size();
            for (int i = 0; i < n; i++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(num);
                outerList.add(innerList);
            }
        }
        return outerList;
    }
}
