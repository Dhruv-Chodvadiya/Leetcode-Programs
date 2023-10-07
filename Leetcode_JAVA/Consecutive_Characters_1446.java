public class Consecutive_Characters_1446 {
    public static void main(String[] args) {
        String s = "leetcode";
        int res=1,c=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))c++;
            else {
                res=Math.max(res,c);
                c=1;
            }
        }res=Math.max(res,c);
        System.out.println(res);
//        return res;
    }
}
