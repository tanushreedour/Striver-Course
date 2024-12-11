import java.util.regex.Pattern;

public class TrainglePattern
{
    public static void main(String[] args) {
        Pattern1(4, 1);
        System.out.println();
        Pattern2(4, 1);
    }
    static void Pattern1(int row, int col){
        if(row == 0)
        {
            return;
        }
        if(col <= row)
        {
            Pattern1(row, col + 1);
            System.out.print("* ");

        }
        else {
            Pattern1(row - 1, 1);
            System.out.println();

        }

    }

    static void Pattern2(int row, int col){
        if(row == 0)
        {
            return;
        }
        if(col <= row)
        {
            System.out.print("* ");
            Pattern2(row, col + 1);

        }
        else {
            System.out.println();
            Pattern2(row - 1, 1);
        }

    }
}
