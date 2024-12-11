import java.io.*;
public class nptel
{
    public static void main(String[] args) {
        try{
            PrintWriter writer = new PrintWriter(System.out);
            writer.write('4'+'2');
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}