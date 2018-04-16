package unit76;

public class QuickSort{

    /**
     * quickSort - entry point to QuickSort routing
     * @param arr integer array to sort
     */
    public static void quickSort(int[] arr){
        quickSortX(arr, 0, arr.length-1);
    }

    /**
     * quickSortX - recursive part of quick sort
     * @param arr  integer array to sort
     * @param from start of array partition to sort
     * @param to   end of array partition to sort
     */
    public static void quickSortX(int[] arr, int from, int to){
        // If we have something to sort...
        if (from < to){
            // Find the pivot point, then sort each half
            int part = partition(arr, from, to);
            quickSortX(arr, from, part-1);
            quickSortX(arr, part+1, to);
        }
    }

    /**
     * partition - selects a partiiton pivot to split the array
     * @param arr  The array we are sorting
     * @param from The start of the array partition to sort
     * @param to   The end of the array partition to sort
     * @return     The element representing the pivot element
     */
    public static int partition(int[] arr, int from, int to){
        int pivot = arr[to];                        // Initial pivot element is the last one 
        int i = from - 1;                           // The element before our planned pivot
        int temp = 0;                               // Used for swapping

        // Loop through the entire partition
        for (int j = from; j < to-1; j++){
            // If the current element is less than our pivot, 
            if (arr[j] < pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[to];
        arr[to] = temp;
        return i+1;
    }
    
}