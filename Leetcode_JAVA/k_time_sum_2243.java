public class k_time_sum_2243 {
    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;

        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > k) {
            StringBuilder newS = new StringBuilder();
            int i = 0;

            while (i < sb.length()) {
                int sum = 0;
                int count = 0;

                while (i < sb.length() && count < k) {
                    sum += sb.charAt(i) - '0';
                    i++;
                    count++;
                }

                newS.append(sum);
            }

            sb = newS;
        }

        System.out.println(sb);
    }
}
