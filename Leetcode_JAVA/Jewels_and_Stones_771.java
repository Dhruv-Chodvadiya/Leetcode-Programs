public class Jewels_and_Stones_771 {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        int count=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                    // break;
                }
            }
        }
         System.out.println(count);
//        return count;
    }
}
