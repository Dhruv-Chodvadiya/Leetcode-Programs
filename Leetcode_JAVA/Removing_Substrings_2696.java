public class Removing_Substrings_2696 {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        StringBuilder s1=new StringBuilder(s);
        while(true)
        {
            boolean checker=true;
            for(int i=0;i<s1.length()-1;i++)
            {
                char a=s1.charAt(i);
                char b=s1.charAt(i+1);
                if((a=='A' && b=='B')||(a=='C' && b=='D')){
                    s1.deleteCharAt(i);
                    s1.deleteCharAt(i);
                    checker=false;
                }
            }
            if(checker) break;
        }
        System.out.println(s1.length());
//        return s1.length();
    }
}
