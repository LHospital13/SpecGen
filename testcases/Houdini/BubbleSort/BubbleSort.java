public class BubbleSort { 
    
    void swap(int x, int y,  int array[]) {
        int temp;     
        temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    int[] bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {	

            for (int j = 0; j < n-i-1; j++) {
                if (arr[j+1] < arr[j]) {  
		            swap(j, j + 1, arr); 
                } 
	        }
	    } 
	    return arr;
    }

    public void __HoudiniInvoker() {
        int[] arr = new int[]{-2, -1, 0, 1, 2};
        bubbleSort(arr);
        arr = new int[]{0};
        bubbleSort(arr);
        arr = new int[]{-2, -1};
        bubbleSort(arr);
        arr = new int[]{2, 3};
        bubbleSort(arr);
        arr = new int[]{0, 1};
        bubbleSort(arr);
        arr = new int[]{-2, -3};
        bubbleSort(arr);
    }
}
