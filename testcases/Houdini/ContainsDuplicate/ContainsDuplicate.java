import java.util.Arrays;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public void __HoudiniInvoker() {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        containsDuplicate(arr);
        arr = new int[]{0};
        containsDuplicate(arr);
        arr = new int[]{-2, -1};
        containsDuplicate(arr);
        arr = new int[]{2, 3};
        containsDuplicate(arr);
        arr = new int[]{0, 1};
        containsDuplicate(arr);
        arr = new int[]{-2, -3};
        containsDuplicate(arr);
    }
}
