public class Swap {
    public static void swap (int[] arr, int a, int b) {
        if(a >= arr.length || a < 0 || b >= arr.length || b < 0) {
            return;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        swap(arr, 0, 0);
        swap(arr, 2, -2);
        swap(arr, -2, 2);
        swap(arr, -2, -2);
        swap(arr, 2, 2);
        arr = new int[]{0};
        swap(arr, 0, 1);
        arr = new int[]{-2, -1};
        swap(arr, 1, 0);
        arr = new int[]{2, 3};
        swap(arr, 1, 1);
        arr = new int[]{0, 1};
        swap(arr, 1, -1);
        arr = new int[]{0, 1};
        swap(arr, 2, 2);
        arr = new int[]{-2, -3, 114};
        swap(arr, -1, 1); 
        arr = new int[]{-2, -3, 114};
        swap(arr, 514, 114);      
    }
}