import java.util.Arrays;

class LargestPerimeter {
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int i;
        for (i = A.length - 1; i >= 2; --i) {
            __Loop_Invariant_Dummy1(A, i);
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        __Loop_Invariant_Dummy1(A, i);
        return 0;
    }

    public static void __Loop_Invariant_Dummy1(int[] A, int i) {}

    public static void main (String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        largestPerimeter(arr);
        arr = new int[]{0};
        largestPerimeter(arr);
        arr = new int[]{-2, -1};
        largestPerimeter(arr);
        arr = new int[]{2, 3};
        largestPerimeter(arr);
        arr = new int[]{0, 1};
        largestPerimeter(arr);
        arr = new int[]{-2, -3};
        largestPerimeter(arr);
        arr = new int[]{0, -3, 1, 10};
        largestPerimeter(arr);
        arr = new int[]{3, 0, 1, 10};
        largestPerimeter(arr);
        arr = new int[]{-2, -3, 0};
        largestPerimeter(arr);
        arr = new int[]{2, 8};
        largestPerimeter(arr);
        arr = new int[]{2, 2};
        largestPerimeter(arr);
        arr = new int[]{0, 1, 213, 703, 713, -32};
        largestPerimeter(arr);
        arr = new int[]{0, 1, 213, 703, 713, 1919};
        largestPerimeter(arr);
        arr = new int[]{0, 1, 2, 3, 4, 5};
        largestPerimeter(arr);
        arr = new int[]{0, 1, 2, 3, 4, 6};
        largestPerimeter(arr);
        arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        largestPerimeter(arr);
        arr = new int[]{0, 1, 2, 3, 4, 6, 7, 5, 8, 10};
        largestPerimeter(arr);
        arr = new int[]{2, 114, 514, 810, 114514};
        largestPerimeter(arr);
        arr = new int[]{114, 512, 513, 514, 810, 927, 999, 0, 114514};
        largestPerimeter(arr);
        arr = new int[]{114, 512, 513, 514, 810, 112, 927, 999, 0, 114514};
        largestPerimeter(arr);
        arr = new int[]{114, 512, 513, 514, 810, 112, 927, 999, 0, 999};
        largestPerimeter(arr);
    }
}
