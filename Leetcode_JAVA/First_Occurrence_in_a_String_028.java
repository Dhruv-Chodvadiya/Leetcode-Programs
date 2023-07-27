public class First_Occurrence_in_a_String_028 {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        int n=newStr(haystack,needle);
        System.out.println(n);
    }
    public static int newStr(String haystack, String needle) {
        int a=haystack.length();
        int b=needle.length();
        if(a<b){
            return -1;
        }
        for(int i=0 ; i<=(a-b) ; i++){
            int j=0;
            while(j<b&&(haystack.charAt(i+j))==needle.charAt(j)){
                j++;
            }
            if(j==b){
                return i;
            }
        }
        return -1;
    }
}
