public class SelectionSortDesc {

    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            __Loop_Invariant_Dummy1(arr, i);
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                __Loop_Invariant_Dummy2(arr, i, index, j);
                if (arr[j] > arr[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }

    public static void __Loop_Invariant_Dummy1(int[] arr, int i) {}

    public static void __Loop_Invariant_Dummy2(int[] arr, int i, int index, int j) {}

    public static void main(String[] args) {
        int[] arr = new int[]{};
        selectionSort(arr);
        arr = new int[]{1};
        selectionSort(arr);
        arr = new int[]{1, -2};
        selectionSort(arr);
        arr = new int[]{1, 1};
        selectionSort(arr);
        arr = new int[]{1, 2, -7};
        selectionSort(arr);
        arr = new int[]{1, 1, 2};
        selectionSort(arr);
        arr = new int[]{7, 1, 3};
        selectionSort(arr);
        arr = new int[]{7, 3, 1};
        selectionSort(arr);
        arr = new int[]{-8, 1, 0, 1};
        selectionSort(arr);
        arr = new int[]{9, 0, 8, -1, 8};
        selectionSort(arr);
        arr = new int[]{9, 0, 114, -1, 114};
        selectionSort(arr);
        arr = new int[]{9, -23, 8, -23, 8};
        selectionSort(arr);
        arr = new int[]{9, -23, 8, 23, -8, 3, 514};
        selectionSort(arr);
    }
}