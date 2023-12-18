public class UniqueNumNested {

    public static int uniqueNum(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            __Loop_Invariant_Dummy1(arr, i);
            int j = 0;
            while(j < arr.length) {
                __Loop_Invariant_Dummy2(arr, i, j);
                if(i != j && arr[i] == arr[j])
                    break;
                j++;
            }
            if(j == arr.length)
                return i;
        }
        return -1;
    }

    public static void __Loop_Invariant_Dummy1(int[] arr, int i) {}

    public static void __Loop_Invariant_Dummy2(int[] arr, int i, int j) {}

    public static void main(String[] args) {
        int[] arr = new int[]{};
        uniqueNum(arr);
        arr = new int[]{1};
        uniqueNum(arr);
        arr = new int[]{1, -2};
        uniqueNum(arr);
        arr = new int[]{1, 1};
        uniqueNum(arr);
        arr = new int[]{1, 2, -7};
        uniqueNum(arr);
        arr = new int[]{1, 1, 2};
        uniqueNum(arr);
        arr = new int[]{7, 1, 3};
        uniqueNum(arr);
        arr = new int[]{-8, 1, 0, 1};
        uniqueNum(arr);
        arr = new int[]{0, 1, 0, 1};
        uniqueNum(arr);
        arr = new int[]{114, 114, 514, 514, 1919, 1919, 810, 810};
        uniqueNum(arr);
        arr = new int[]{1919, 1919, 1919, 1919, 1919};
        uniqueNum(arr);
        arr = new int[]{9, 0, 8, -1, 8};
        uniqueNum(arr);
        arr = new int[]{9, 0, 114, -1, 114};
        uniqueNum(arr);
        arr = new int[]{9, -23, 8, -23, 8};
        uniqueNum(arr);
        arr = new int[]{9, -23, 8, 23, -8, 3, 514};
        uniqueNum(arr);
        arr = new int[]{9, 9, -23, 8, -23, 8, 3, 514, 514};
        uniqueNum(arr);
    }
    
}