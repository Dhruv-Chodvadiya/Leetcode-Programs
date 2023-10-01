public class Binary_Substrings_696 {
    public static void main(String[] args) {
        String s = "00110011";
        int curr = 1, prev = 0, ans = 0;
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == s.charAt(i-1)) curr++;
            else {
                ans += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        System.out.println( ans + Math.min(curr, prev));
    }
}
