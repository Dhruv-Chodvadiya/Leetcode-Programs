public class Sentence_1455 {
    public static void main(String[] args) {
        String sentence = "i love eating burger", searchWord = "burg";
        String[] s=sentence.split(" ");
        for(int i=0;i<s.length;i++){
            if(check(s[i],searchWord)){
                 System.out.println(i+1);
                 return;
//                return i+1;
            }
        }
         System.out.println("-1");
//        return -1;
    }
    private static boolean check(String s,String search){
        if(s.length()<search.length()) {
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.startsWith(search)){
                return true;
            }
        }
        return false;
    }
}
