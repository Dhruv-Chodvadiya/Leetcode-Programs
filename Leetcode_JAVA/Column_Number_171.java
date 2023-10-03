public class Column_Number_171 {
    public static void main(String[] args) {
        String columnTitle = "A";
        int n = columnTitle.length()-1;
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum+=Math.pow(26,n-i) * (columnTitle.charAt(i)-64);;
        }
//        return sum;
        System.out.println(sum);
    }
}
