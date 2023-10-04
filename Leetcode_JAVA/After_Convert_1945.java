public class After_Convert_1945 {
    public static void main(String[] args) {
        String s = "iiii";
        int k=1;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'a';
            sb.append(n+1);
        }
//        System.out.println(sb);


//        System.out.println(s);

        for(int i=0;i<k;i++){
            s=sb.toString();
            sb=sb.delete(0,sb.length());
            int sum=0;
            for(int j=0;j<s.length();j++){
                int n=s.charAt(j)-'0';
                sum+=n;
            }
            sb.append(sum);
        }
//        System.out.println(sb.toString());
        int val=Integer.parseInt(sb.toString());
        System.out.println(val);
//        return val;
    }
}
