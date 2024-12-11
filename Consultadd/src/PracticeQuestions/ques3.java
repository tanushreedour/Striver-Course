package PracticeQuestions;

import java.util.HashMap;

public class ques3 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 3, 4, 5, 6};
        int[] order = {3, 1, 6};

        System.out.println(timeTaken(arr, order));
    }
    static int timeTaken(int[] arr, int[] order)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length ; i++)
        {
            map.put(arr[i], i);
        }
        int max = -1;
        int time = 0;

        for(int i = 0; i < order.length; i++)
        {
            int current = map.get(order[i]);

            if(current > max)
            {
                time = time + (2 * (current - i)+ 1);
                max = current;
            }
            else
            {
                time++;
            }
        }
        return time;
    }
}