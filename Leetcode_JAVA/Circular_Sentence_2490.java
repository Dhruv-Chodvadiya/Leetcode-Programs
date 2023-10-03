public class Circular_Sentence_2490 {
    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
        boolean val=sen(sentence);
        System.out.println(val);
    }
    public static boolean sen(String s){
        String[] a = s.split("\\s+"); 
        int n = a.length;
        if(n==1)
        {
            int h = a[0].length();
            if(a[0].charAt(0)==a[0].charAt(h-1))
                return true;
            else
                return false;
        }
        for(int i=0;i<n-1;i++)
        {
            int h = a[i].length();
            if(a[i].charAt(h-1)!=a[i+1].charAt(0))
                return false;
        }
        int j = a[n-1].length();
        if(a[0].charAt(0) != a[n-1].charAt(j-1))
            return false;
        return true;
    }
}
