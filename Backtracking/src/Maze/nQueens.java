package Maze;

public class nQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
    static int queens(boolean[][] board, int row)
    {
        if(row == board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        for(int col = 0; col < board.length; col++)
        {
            if(isSafe(board, row, col))
            {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // checking in upward direction
        for(int i = 0; i < row; i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        // checking for left diagonal
        for(int i = 1; i <= Math.min(row, col); i++)
        {
            if(board[row-i][col-i])
            {
                return false;
            }
        }
        // checking for right diagonal
        for(int i = 1; i <= Math.min(row, board.length-col-1); i++)
        {
            if (board[row - i][col+i]) {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] arr : board)
        {
            for(boolean n : arr)
            {
                if(n)
                {
                    System.out.print("Q ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
