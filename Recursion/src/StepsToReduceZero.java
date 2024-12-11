public class StepsToReduceZero
{
    public static void main(String[] args) {
        System.out.println(StepsCount(10));
    }
    static int count = 0;
    static int StepsCount(int num){
        if(num != 0){
            count++;
            if((num & 1) == 0){
                return StepsCount(num / 2);
            }
            else{
                return StepsCount(num - 1);
            }
        }
        return count;
    }
}
