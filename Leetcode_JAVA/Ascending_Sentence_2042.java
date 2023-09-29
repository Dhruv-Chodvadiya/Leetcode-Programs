public class Ascending_Sentence_2042 {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String[] chars=s.split(" ");
        // System.out.println(Arrays.toString(chars));
        int count=0;
        for(int i=0;i<chars.length;i++){
            String a=chars[i];
            if(Character.isDigit(a.charAt(0))){
                count++;
            }
        }
        // System.out.println(count);
        String[] arr=new String[count];
        int j=0;
        for(int i=0;i<chars.length;i++){
            String a=chars[i];
            if(Character.isDigit(a.charAt(0))){
                arr[j]=chars[i];
                j++;
            }
        }
        // System.out.println(Arrays.toString(arr));
        count=0;
        for(int i=0;i<arr.length-1;i++){
            int a=Integer.parseInt(arr[i]);
            int a1=Integer.parseInt(arr[i+1]);
            if(a<a1){
                count++;
            }
        }
        if(count==arr.length-1){
             System.out.println("true");
             return;
//            return true;
        }
//        return false;
         System.out.println("false");
    }
}
