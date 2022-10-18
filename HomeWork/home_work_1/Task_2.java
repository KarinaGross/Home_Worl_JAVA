import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3};
        int val = 2;
        int result = removeElement(nums, val);
        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = '_';
                k--;
            }
        }
        Arrays.sort(nums);
        return k;
    }

}
