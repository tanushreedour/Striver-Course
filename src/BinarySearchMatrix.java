import java.util.Arrays;

public class BinarySearchMatrix
{
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15 ,16}
        };

        int target = 19;
        System.out.println(Arrays.toString(Search(matrix, target)));
    }
    static int[] BinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target)
    {
        while(cStart <= cEnd)
        {
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target)
            {
                return new int[]{row, mid};
            }
            else if(matrix[row][mid] < target){
                cStart = mid+1;
            }
            else {
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Search(int[][] matrix, int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // If matrix contains only one row
        if(rows==1)
        {
            return BinarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        while(rStart < (rEnd-1))
        {
            int rMid = rStart + (rEnd - rStart) / 2;

            if(matrix[rMid][cMid] == target)
            {
                return new int[]{rMid, cMid};
            }
            else if(matrix[rMid][cMid] < target)
            {
                rStart = rMid;
            }
            else {
                rEnd = rMid;
            }
        }

        // Now only 2 rows left for searching
        if(matrix[rStart][cMid] == target)
        {
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target)
        {
            return new int[]{rStart+1, cMid};
        }

        // You are unable to find the target element in middle column then make 4 partitions of these 2 rows
        // in order to search that element with respect to middle column.

        // 1st half
        if(target <= matrix[rStart][cMid - 1])
        {
            return BinarySearch(matrix, rStart, 0,cMid-1, target);
        }
        // 2nd half
        else if(target <= matrix[rStart + 1][cMid - 1] && target > matrix[rStart][cols-1])
        {
            return BinarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        // 3rd half
        else if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1])
        {
            return BinarySearch(matrix, rStart, cMid+1, cols-1, target);
        }
        else{
            return BinarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }
    }
}
