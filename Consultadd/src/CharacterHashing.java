public class CharacterHashing {
    public static void main(String[] args) {
        String str = "abcbdcccaabbd";
        int hash[] = calcount(str);
        char c = 'a';
        int val = (int) c;
        System.out.println("Ocurrences of " + c + " : " + hash[val - 97]);
    }
    static int[] calcount(String s)
    {
        int hash[] = new int[26];

        for(int i =0; i < s.length(); i++)
        {
            hash[(int)s.charAt(i) - 97] += 1;
        }

        return hash;
    }
}
