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
     * partition - selects a partiiton pivot to split the array, Lomuto scheme
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
            // If the current element is less than our pivot, swap since we're out of order
            if (arr[j] < pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Move our pivot into the correct place and return that place.
        temp = arr[i+1];
        arr[i+1] = arr[to];
        arr[to] = temp;
        return i+1;
    }

    /**
     * partition - selects a partiiton pivot to split the array, Hoare scheme
     * @param arr  The array we are sorting
     * @param from The start of the array partition to sort
     * @param to   The end of the array partition to sort
     * @return     The element representing the pivot element
     */
    public static int partition2(int[] arr, int from, int to){
        int pivot = arr[from];                  // Pick a pivot point
        int i = from;                           // Start at the ends of the section
        int j = to;
        int temp = 0;

        // Keep going forever - we'll break at some point
        while (true){
            // Keep incrementing i until we're no longer less than our pivot
            while (arr[i]<pivot) i++;

            // Keep decrementing j until we're no longer greater than our pivot
            while (arr[j]>pivot) j++;

            // If we passed each other, we're done - return j as our pivot point
            if (i>=j) return j;

            // Else we swap, since we found these aren't in the right order
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
    
}