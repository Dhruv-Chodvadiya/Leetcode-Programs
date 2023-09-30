import java.util.Arrays;

public class Size_k_2138 {
    public static void main(String[] args) {
        String s = "abcdefghi";
        int k = 3;
        char fill = 'x';
        // int k = 3;
        int n=s.length();
        int z=n/k;
//        System.out.println(z);
        double a=n;
        double b=k;
        double c=a/b;
//        System.out.println(c);
        double d=c-z;
//        System.out.println(d);
        if(d>0){
            z++;
        }
//        System.out.println(z);
        int e=z*k;
//        System.out.println(e);
        StringBuilder sb=new StringBuilder(s);
        while (sb.length()<e){
            sb.append(fill);
        }
//        System.out.println(sb);
        String s1=new String(sb);
        String[] results = s1.split("(?<=\\G.{" + k + "})");
         System.out.println(Arrays.toString(results));
//        return results;
    }
}
