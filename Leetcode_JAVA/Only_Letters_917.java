public class Only_Letters_917 {
    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        char temp[] = s.toCharArray();
        int low = 0 , high = s.length()-1;
        while(low < high){
            if(Character.isAlphabetic(temp[low]) && Character.isAlphabetic(temp[high])){
                char i = temp[low];
                temp[low] = temp[high];
                temp[high] = i;
                low++;
                high--;
            }else if(!Character.isAlphabetic(temp[low]))  low++;
            else if(!Character.isAlphabetic(temp[high]))  high--;
        }
//        return String.valueOf(temp);
        System.out.println(String.valueOf(temp));
    }
}
