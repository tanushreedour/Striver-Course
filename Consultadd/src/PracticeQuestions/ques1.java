package PracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n ; i++)
        {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int j = 0; j< m ; j++)
        {
            arr2[j] = sc.nextInt();
        }
        Arrays.sort(arr1);
        for(int i = 0; i< m; i++)
        {
            int count = 0;
            for(int j = 0; j<n; j++)
            {
                if(arr1[j] < arr2[i])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
