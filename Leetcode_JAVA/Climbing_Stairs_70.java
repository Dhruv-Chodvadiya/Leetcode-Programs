public class Climbing_Stairs_70 {
    public static void main(String[] args) {
        int n=2;
        int ways = 1;

        for (int i = 1; i <= n / 2; i++) {
            double sum = 1;

            for (int j = i; j < 2 * i; j++) {
                sum *= (double)(n - j) / (j - i + 1);
            }

            ways += sum;
        }

        System.out.println(ways);
    }
}
