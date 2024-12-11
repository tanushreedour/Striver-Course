public class PowerOfTwo
{
    public static void main(String[] args) {
        int n = 0;
        System.out.println(IsPowerOfTwo(n));
    }
    public static boolean IsPowerOfTwo(int n){
        if(n==0) return false;
        if((n&(n-1))==0)
        {
            return true;
        }
        return false;
    }
}
