public class Main {
    public static void main(String[] args){
        int[] num ={2,7,11,15};
        int target = 9;
        int[] result= new int[2];
        for(int i=0;i<num.length;i++){
            for(int j=(i+1);j<num.length;j++){
                if(num[i]+num[j]==target){
                    result[0]=i;
                    result[1]=j;
//                    System.out.println(result);
                }
            }
        }
        for(int i=0;i<2;i++) {
            System.out.print("[ "+result[i] + " ]");
        }
    }
}