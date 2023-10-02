public class Reformat_Date_1507 {
    public static void main(String[] args) {
        String date = "20th Oct 2052";
        String[] s=date.split(" ");

        StringBuilder sb=new StringBuilder();

        for(int i=s.length-1;i>=0;i--){
            if(i==s.length-1){
                sb.append(s[i]).append("-");
            }
            if(i==s.length-2){
                sb.append(month(s[i])).append("-");
            }
            if (i == 0) {
                if (s[0].length() == 3) {
                    sb.append("0").append(s[0].charAt(0));
                } else {
                    sb.append(s[0].charAt(0));
                    sb.append(s[0].charAt(1));
                }
            }
        }
         System.out.println(sb);
//        return sb.toString();
    }
    private static String month(String month){
        String[] m={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for(int i=0;i<12;i++){
            if(month.equals(m[i])){
                if(i<9){
//                    System.out.println("0"+(i+1)+"");
                    return ("0"+(i+1)+"");
                }else {
                    return (i+1+"");
                }
            }
        }
        return "";
    }
}
