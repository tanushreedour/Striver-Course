// Problem statement:
// A plant grows with upspeed meters in day and it's height get reduced by downspeed meters in night, find in how many days it will reach a desired height.
// Input: upspeed, downspeed, desired height

// Example:
// upspeed = 5
// downspeed = 3
// desired height = 23

// Output : 10

public class Main {
    public static void main(String[] args) {
        int up = 10;
        int down = 6;
        int desired = 18;
        System.out.println(findDays(up, down, desired));
    }
    static int findDays(int up, int down, int desired)
    {
        int change = up - down;
        int days = desired / change;

        if(((days - 1) * change + down ) == desired){
            days--;
        }
        return days;
    }
}