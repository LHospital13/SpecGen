import java.util.Arrays;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            __Loop_Invariant_Dummy1(nums, n, i);
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void __Loop_Invariant_Dummy1(int[] nums, int n, int i) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        containsDuplicate(arr);
        arr = new int[]{0};
        containsDuplicate(arr);
        arr = new int[]{-2, -1};
        containsDuplicate(arr);
        arr = new int[]{2, 3, 2};
        containsDuplicate(arr);
        arr = new int[]{0, 1};
        containsDuplicate(arr);
        arr = new int[]{-2, -3};
        containsDuplicate(arr);
        arr = new int[]{-2, -3, 114, 514, 1919, 810, 1919};
        containsDuplicate(arr);
        arr = new int[]{-2, -3, 114, 514, 1919, 810};
        containsDuplicate(arr);
        arr = new int[]{-2, 514, 114, 514, 1919, 810};
        containsDuplicate(arr);
        arr = new int[]{-2, -3, 114, 1919, 810, -124};
        containsDuplicate(arr);
        arr = new int[]{-2, -3, 114, 514, 114, 810, 1293, 1919, 810};
        containsDuplicate(arr);
        arr = new int[]{514, 114, 810, -2, -5, 1293, 199, 1039};
        containsDuplicate(arr);
    }
}
