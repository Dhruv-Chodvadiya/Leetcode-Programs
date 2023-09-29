import java.util.Arrays;

public class Formed_by_Characters_1160 {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        int[] char_map = new int[26];
        int ans=0;
        for(char c : chars.toCharArray()){
            char_map[c-'a']++;
        }

        for(String word: words){
            int[] dummyArray = Arrays.copyOf(char_map, char_map.length);
            int count =0;
            for(char c: word.toCharArray()){
                if(dummyArray[c-'a']>0){
                    count++;
                    dummyArray[c-'a']--;
                }
            }
            if(count==word.length()){
                ans+=word.length();
            }
        }
        System.out.println(ans);
//        return ans;
    }
}
