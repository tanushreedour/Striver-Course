package Bit_Manipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(15));
    }
    @org.jetbrains.annotations.NotNull
    static StringBuilder binaryToDecimal(int n)
    {
        StringBuilder ans = new StringBuilder();

        while(n != 1)
        {
            if(n % 2 == 0)
            {
                ans.append("0");
            }
            else {
                ans.append("1");
            }
            n = n / 2;
        }
        if(n == 1)
        {
            ans.append("1");
        }
        ans.reverse();
        return ans;
    }
}
