package PracticeQuestions;

public class ques4 {
    public static void main(String[] args) {
        String a = "abba";
        String b = "azza";
        int k = 2;
        System.out.println(canTransform(a,b,k));
    }
    static String canTransform(String a, String b, int k)
    {
        int[] freqA = new int[26];
        int[] freqB = new int[26];

        for(int i = 0; i < a.length() ; i++)
        {
            freqA[(int)a.charAt(i) - (int)'a']++;
            freqB[(int)b.charAt(i) - (int)'a']++;
        }
        int cnt = 0;
        for(int i = 0; i < a.length() ; i++)
        {
            cnt = cnt + freqA[i];

            if(cnt < freqB[i])
            {
                return "NO";
            }
            cnt = cnt - freqB[i];

            if(cnt % k != 0)
            {
                return "NO";
            }
        }
        return "YES";
    }
}
