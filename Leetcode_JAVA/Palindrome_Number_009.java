public class Palindrome_Number_009 {
    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        long reversed = 0;
        int y = x;

        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }

        return reversed == x;
    }

}
