public class Appear_Twice_2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        boolean[] letters = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (letters[index]) {
                System.out.println(s.charAt(i));
                return;
            } else {
                letters[index] = true;
            }
        }
        System.out.println(" ");
    }
}
