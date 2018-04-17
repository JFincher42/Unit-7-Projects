package unit74;

public class SelectionSort {

  /**
   * selectionSort - performs a Merge Sort on the provided array
   * @param arr  The array we are sorting
   * @return     Nothing
   */
  public static void selectionSort(int[] arr)
  {
    // Grow the sorted part, shrink the unsorted part….
    // i is the index of the first element of the unsorted part…
    for (int i = 0; i < arr.length - 1; i++)
    {
        // find index of smallest value of the unsorted part…
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) 
        {
            if (arr[j] < arr[minIndex]) 
                minIndex = j;
        }
         // swap smallest value its proper place, a[i]
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
  }
}