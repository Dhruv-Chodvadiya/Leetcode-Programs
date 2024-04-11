public class Majority_Element_169 {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        int count=0;
        int i;
        int num=0;
        for(i=0;i<arr.length;i++){
            int a=arr[i];
            int temp=0;
            for(int j=i;j<arr.length;j++){
                if(a==arr[j]){
                    temp++;
                }
            }
            if(temp>count){
                count=temp;
                num=arr[i];
            }
        }
        System.out.println(num);
    }
}
