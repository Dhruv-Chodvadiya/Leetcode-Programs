public class Letter_in_String_2278 {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        double count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
        count=count/n;

        double val=count*100;
        System.out.println((int)val);
//        return (int)val;
    }
}
