import java.sql.Struct;

public class Phone_Number_1694 {
    public static void main(String[] args) {
        String number = "1-23-5";

        number = number
                .replace(" ", "")
                .replace("-", "");

        StringBuilder result = new StringBuilder();

        int i = 0;
        int mod = 3;
        int limit = number.length();
        if (limit == 4) {
            mod = 2;
        }

        while (i < limit) {
            result.append(number.charAt(i));
            if ((i + 1) < limit && (i + 1) % mod == 0) {
                result.append("-");
                if (limit - (i + 1) == 4) {
                    mod = 2;
                    int j = i + 1;
                    while (j < limit) {
                        result.append(number.charAt(j));
                        if (j != limit - 1 && (limit - j) % mod == 1) {
                            result.append("-");
                        }
                        j++;
                    }
                    break;
                }
            }
            i++;
        }

        System.out.println(result);
//        return result.toString();
    }
}
