public class EvenDigitsCount
{
    public static void main(String[] args) {
        int[]arr = {12, 34, 5, 34, 2, 9, 9873};
        System.out.println("Numbers with even number of digits : " + EvenDigits(arr));
    }
    static int EvenDigits(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int digits = (int)(Math.log10(arr[i]) + 1);
            if((digits & 1) == 0)
            {
                count++;
            }
        }
        return count;
    }
}
