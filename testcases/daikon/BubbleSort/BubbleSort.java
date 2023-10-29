public class BubbleSort { 
    
    static void swap(int x, int y,  int array[]) {
        int temp;     
        temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static int[] bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {	
            __Loop_Invariant_Dummy1(arr, n, i);
            for (int j = 0; j < n-i-1; j++) {
                __Loop_Invariant_Dummy2(arr, n, i, j);
                if (arr[j+1] < arr[j]) {  
		            swap(j, j + 1, arr); 
                } 
	        }
	    } 
	    return arr;
    }

    public static void __Loop_Invariant_Dummy1(int[] arr, int n, int i) {}

    public static void __Loop_Invariant_Dummy2(int[] arr, int n, int i, int j) {}

    public static void main(String[] args) {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        bubbleSort(arr);
        arr = new int[]{};
        bubbleSort(arr);
        arr = new int[]{0};
        bubbleSort(arr);
        arr = new int[]{-2, -1};
        bubbleSort(arr);
        arr = new int[]{2, 3};
        bubbleSort(arr);
        arr = new int[]{0, 1, 1, 3, 2, -3};
        bubbleSort(arr);
        arr = new int[]{-2, -3};
        bubbleSort(arr);
        arr = new int[]{2, 1, 0, -1, -2, -3, -4};
        bubbleSort(arr);
        arr = new int[]{12306, -2, 2, 114, 514, 810, 927, 999, 11514, 512, 513};
        bubbleSort(arr);
        arr = new int[]{-10000, 114514, 572, -2, 2, 11824, 512, 513, -10000};
        bubbleSort(arr);
    }
}
