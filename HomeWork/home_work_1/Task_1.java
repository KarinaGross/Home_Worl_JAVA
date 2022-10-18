import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = buildArray(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] buildArray(int[] nums) {

        int size = nums.length;
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
