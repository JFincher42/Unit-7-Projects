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
   * @param from The left-most element of the section to be sorted
   * @param to   The right-most element of the section to be sorted
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
   * @param from The left-most element of the sorted left section
   * @param mid  The left-most element of the sorted right section
   * @param to   The last element to be merged
   * @param temp A temporary array to hold the results
   * @return     Nothing
   */
  private static void merge(int[] arr, int from, int mid, int to, int[] temp)
  {
    int nextLeft = from;                // The next element of the left section
    int nextRight = mid + 1;            // The next element of the right section
    int nextMerge = from;               // Where to put the next lowest element in temp

    // If there are elements in both sections
    while (nextLeft <= mid && nextRight <= to) {
      // Find the lowest element, and copy it to temp
      // We can simplify this a bit
      if (arr[nextLeft] < arr[nextRight]) {      
        temp[nextMerge] = arr[nextLeft];
        nextLeft++;
      } else {
        temp[nextMerge] = arr[nextRight];
        nextRight++;
      }
      nextMerge++;
    }

    // Does the left section have any elements remaining? Copy them over
    while (nextLeft <= mid)  {
      temp[nextMerge] = arr[nextLeft];
      nextLeft++;
      nextMerge++;
    }

    // Does the right section have anay elements remaining? Copy them over
    while (nextRight <= to)  {
      temp[nextMerge] = arr[nextRight];
      nextRight++;
      nextMerge++;
    }

    // Now blast the whole thing back into the source array
    for (int mergedIndex = from; mergedIndex <= to; mergedIndex++)  {
      arr[mergedIndex] = temp[mergedIndex];
    }
  }
}