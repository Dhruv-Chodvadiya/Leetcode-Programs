public class Two_Words_1880 {
    public static void main(String[] args) {
        String firstWord = "acb", secondWord = "cba", targetWord = "cdb";
        int a=0;
        for(int i=0;i<firstWord.length();i++){
            int asci=firstWord.charAt(i)-97;
            a=(a*10)+asci;
        }
        // System.out.println(a);

        int b=0;
        for(int i=0;i<secondWord.length();i++){
            int asci=secondWord.charAt(i)-97;
            b=(b*10)+asci;
        }
        // System.out.println(b);

        int c=0;
        for(int i=0;i<targetWord.length();i++){
            int asci=targetWord.charAt(i)-97;
            c=(c*10)+asci;
        }
        // System.out.println(c);

        int val=a+b;
        if(val==c){
             System.out.println("true");
             return;
//            return true;
        }
         System.out.println("false");
//        return false;
    }
}
