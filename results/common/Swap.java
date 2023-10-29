public class Swap {
    //@ requires arr != null && 0 <= a && a < arr.length && 0 <= b && b < arr.length;
    //@ ensures arr[a] == \old(arr[b]) && arr[b] == \old(arr[a]);
    public static void swap (int[] arr, int a, int b) {
        if(a >= arr.length || a < 0 || b >= arr.length || b < 0) {
            return;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

