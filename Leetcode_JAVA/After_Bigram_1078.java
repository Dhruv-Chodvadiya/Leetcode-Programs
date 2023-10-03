import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class After_Bigram_1078 {
    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        String[] s=text.split(" ");
        List<String> list=new ArrayList<>();

        for(int i=0;i<s.length-2;i++){
            if(s[i].equals(first) && s[i+1].equals(second)){
                list.add(s[i+2]);
            }
        }

        String[] arr=new String[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
         System.out.println(Arrays.toString(arr));
//        return arr;
    }
}
