public class Given_String_2255 {
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        int count=0;
        for(String word:words){
            if(s.startsWith(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}
