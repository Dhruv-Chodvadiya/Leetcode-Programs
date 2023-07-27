public class Remove_Duplicates_from_Sorted_Array_026 {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,4,5,6,6,7};
        int j = removeDuplicates(nums);
        System.out.println(j);
    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
