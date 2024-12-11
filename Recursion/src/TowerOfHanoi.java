public class TowerOfHanoi
{
    public static void main(String[] args) {
        int n = 5;
        int source = 1;
        int help = 2;
        int dest= 3;
        TOH(n, source, help, dest);
        System.out.println("\nTotal number of steps required in this problem : "+((int)Math.pow(2, n) - 1));
    }
    static void TOH(int n, int source, int help, int dest)
    {
        if(n == 1)
        {
            System.out.println("Move disk "+ n+ " from rod "+source+" to rod "+dest);
            return;
        }
        TOH(n-1,source, dest, help);
        System.out.println("Move disk "+ n+ " from rod "+source+" to rod "+dest);
        TOH(n-1, help, source, dest);
    }
}
