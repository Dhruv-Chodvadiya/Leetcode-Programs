public class Remove_Element_027 {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int val=5;

        System.out.println(removeElement(arr,val));

    }
}
