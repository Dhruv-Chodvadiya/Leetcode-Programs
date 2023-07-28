public class Length_of_Last_Word_058 {
    public static void main(String[] args) {
        String s = "Hello World";
        int n=lengthOfLastWord(s);
        System.out.println(n);
    }
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
