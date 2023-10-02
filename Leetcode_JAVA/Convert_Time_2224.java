public class Convert_Time_2224 {
    public static void main(String[] args) {
        String current = "02:30", correct = "04:15";

        int a=Integer.parseInt(current.substring(0,2));
        int b=Integer.parseInt(current.substring(3));
        int x = a*60+b;

        int c = Integer.parseInt(correct.substring(0, 2));
        int d = Integer.parseInt(correct.substring(3));
        int y = c*60+d;

        int k = y-x;

        int ans = 0;

        while(k>0){
            if(k%60==0){
                k -= 60;
                ans++;
            }
            else if(k%15==0){
                k -= 15;
                ans++;
            }
            else if(k%5==0){
                k -= 5;
                ans++;
            }
            else if(k%1==0){
                k -= 1;
                ans++;
            }
        }

        System.out.println(ans);
    }
}
