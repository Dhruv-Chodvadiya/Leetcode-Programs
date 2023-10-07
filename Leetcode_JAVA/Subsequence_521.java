public class Subsequence_521 {
    public static void main(String[] args) {
        String a = "aba", b = "cdc";
        if(a.equals(b)){
            System.out.println("-1");
            return;
        }
        System.out.println(Math.max(a.length(),b.length()));
    }
}
