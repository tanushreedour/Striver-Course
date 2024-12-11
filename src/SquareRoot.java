public class SquareRoot
{
    public static void main(String[] args) {
        int n = 40;
        int p =4;
        System.out.println(Root(n, p));
    }

    // Time complexity: O(log n)
    static double Root(int n, int p){
        double root = 0;

        int start = 0;
        int end = n;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid == n){
                return mid;
            }
            else {
                if (mid * mid < n) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
         }

        double x = 0.1;

        for(int i=0; i< p; i++){
            while(root * root < n){
                root = root + x;
            }
            root = root - x;
            x = x/ 10;
        }
        return root;
    }
}
