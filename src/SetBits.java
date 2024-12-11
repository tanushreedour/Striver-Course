public class SetBits
{
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(CheckSetBits(n));
    }
    public static int CheckSetBits(int n){
        int count = 0;
        while(n>0)
        {
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
