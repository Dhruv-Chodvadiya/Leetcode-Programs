public class Reverse_Integer_007 {
    public static void main(String[] args) {
        int x=-123;
        System.out.println(reverse(x));
    }
    public static int reverse( int x){
        long ans = 0;
        while (x != 0) {
            long r = x % 10;
            ans = ans * 10 + r;
            x = x / 10;
        }
        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
    }

}
