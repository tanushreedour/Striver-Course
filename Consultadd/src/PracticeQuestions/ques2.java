package PracticeQuestions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strarr = s.split(" ");
//        int[] arr = new int[strarr.length];
//        for(int i = 0; i<strarr.length;i++)
//        {
//            arr[i] = Integer.parseInt(strarr[i]);
//        }
        int[] arr = Arrays.stream(strarr).mapToInt(Integer::parseInt).toArray();
        int diff = sc.nextInt();

        int count = 0;
        for(int i =0; i< arr.length-1; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(Math.abs(arr[j] - arr[i]) == diff)
                {
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(strarr));
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
