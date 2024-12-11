package Maze;

import java.util.ArrayList;
import java.util.Arrays;

public class CountPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] ans = new int[maze.length][maze[0].length];
        printAllPaths("", maze, 0, 0, ans, 1);
    }

    static int countPath(int row, int col) {
        // base condition
        if (row == 1 || col == 1) {
            return 1;
        }
        // logic for maze
        int left = countPath(row - 1, col);
        int right = countPath(row, col - 1);

        return left + right;
    }

    static void printPath(String p, int row, int col)
    {
        if(row == 1 && col ==1 )
        {
            System.out.println(p);
            return;
        }
        if(row > 1)
        {
            printPath(p + "D", row-1, col);
        }
        if(col>1)
        {
            printPath(p + "R", row, col-1);
        }
    }
    static ArrayList<String> printPathList(String p, int row, int col)
    {
        if(row == 1 && col == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(row>1)
        {
            list.addAll(printPathList(p + "D", row-1, col));
        }
        if(col>1)
        {
            list.addAll(printPathList(p+"R", row, col-1));
        }
        return list;
    }

    // Maze with obstacles:
    // If there is a river at a matrix[row][col] then just skip it and try another paths
    static void printPathListRiver(String p, boolean[][] maze, int row, int col)
    {
        // termination point
        if(row == maze.length-1 && col == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        // obstacle checkpoint
        if(!maze[row][col])
        {
            return;
        }
        if(row < maze.length-1)
        {
            printPathListRiver(p + "D", maze, row+1, col);
        }
        if(col < maze[0].length-1)
        {
            printPathListRiver(p + "R", maze, row, col+1);
        }
    }

    // Person can move in four directions : U, D, L, R
    // Backtracking problem : Make a change, reverse the change 😊✨
    static void allPaths(String p, boolean[][] arr, int row, int col)
    {
        if(row == arr.length-1 && col == arr[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(! arr[row][col])
        {
            return;
        }

        arr[row][col] = false;

        if(row < arr.length-1)
        {
            allPaths(p + "D", arr, row+1, col);
        }
        if(col < arr[0].length-1)
        {
            allPaths(p+"R", arr, row, col+1);
        }
        if(row > 0)
        {
            allPaths(p+"U", arr, row-1, col);
        }
        if(col > 0)
        {
            allPaths(p+"L", arr, row, col-1);
        }
        arr[row][col] = true;
    }

    // Print paths in the form of numbers in a matrix
    static void printAllPaths(String p, boolean[][] arr, int row, int col, int[][] ans, int step)
    {
        //base condition:
        if(row == arr.length-1 && col == arr[0].length-1)
        {
            ans[row][col] = step;
            for(int[] a : ans)
            {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            System.out.println();
        }

        if(! arr[row][col])
        {
            return;
        }

        ans[row][col] = step;
        arr[row][col] = false;

        if(row < arr.length - 1)
        {
            printAllPaths(p+"D", arr, row+1, col, ans, step+1);
        }
        if(col < arr[0].length-1)
        {
            printAllPaths(p+"R", arr, row, col+1, ans, step+1);
        }
        if(row > 0)
        {
            printAllPaths(p+"U", arr, row-1, col, ans, step+1);
        }
        if(col > 0)
        {
            printAllPaths(p+"L", arr, row, col-1, ans, step+1);
        }
        ans[row][col] = 0;
        arr[row][col] = true;
    }
}
