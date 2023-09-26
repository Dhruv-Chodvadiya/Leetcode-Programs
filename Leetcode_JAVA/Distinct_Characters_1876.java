public class Distinct_Characters_1876 {
    public static void main(String[] args) {
        String s = "xyzzaz";
        int count=0;
        for(int i=2;i<s.length();i++){
            int a=s.charAt(i);
            int b=s.charAt(i-1);
            int c=s.charAt(i-2);
            if(a!=b && a!=c && b!=c){
                count++;
            }
        }
        System.out.println(count);
    }
}
