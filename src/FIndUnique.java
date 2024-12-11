public class FIndUnique {
    public static void main(String[] args) {
        int[] arr = {18, 32, 26, 59, 18, 75, 32, 26, 75};
        System.out.println(FindUnique(arr));
    }
    private static int FindUnique(int[] arr){
        int unique = 0;
        for(int i : arr)
        {
            unique ^= i;
        }
        return unique;
    }
}
