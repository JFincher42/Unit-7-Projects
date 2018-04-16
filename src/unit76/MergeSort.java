package unit76;

public class MergeSort {

  /**
   * mergeSort - performs a Merge Sort on the provided array
   * @param arr  The array we are sorting
   * @return     Nothing
   */
  public static void mergeSort(int[] arr)
  {
    int n = arr.length;
    int[] temp = new int[n];
    mergeSortX(arr, 0, n - 1, temp);
  }

  /**
   * mergeSortX - the recursive part of Merge Sort
   * @param arr  The array we are sorting
   * @param from The left-most element of the array
   * @param to   The right-most element of the array
   * @param temp A temporary array to hold intermediate results
   * @return     Nothing
   */
  private static void mergeSortX(int[] arr, int from, int to, int[] temp)  {
    // If from >= to, then there's nothing to sort
    if (from < to)
    {
      // Calculate the middle element, then sort each half
      int middle = (from + to) / 2;
      mergeSortX(arr, from, middle, temp);
      mergeSortX(arr, middle + 1, to, temp);
      // When done, merge the two sorted halves together
      merge(arr, from, middle, to, temp);
    }
  }


  /**
   * merge - merges two adjacent sections of an array
   * @param arr  The array we are merging
   * @param from The left-most element of the left array
   * @param mid  The mid-point between the two sections
   * @param to   The right-most element of the right array
   * @param temp A temporary array to hold the results
   * @return     Nothing
   */
  private static void merge(int[] arr, int from, int mid, int to, int[] temp)
  {
    int i = from;               // The next element of the left section
    int j = mid + 1;            // The next element of the right section
    int k = from;               // Where to put the next lowest element in temp

    // If there are elements in both sections
    while (i <= mid && j <= to) {
      // Find the lowest element, and copy it to temp
      // We can simplify this a bit
      if (arr[i] < arr[j]) {      
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }

    // Does the left section have any elements remaining? Copy them over
    while (i <= mid)  {
      temp[k] = arr[i];
      i++;
      k++;
    }

    // Does the right section have anay elements remaining? Copy them over
    while (j <= to)  {
      temp[k] = arr[j];
      j++;
      k++;
    }

    // Now blast the whole thing back into the source array
    for (k = from; k <= to; k++)  {
      arr[k] = temp[k];
    }
  }
}