package unit74;

public class InsertionSort {

  /**
   * insertionSort - performs a Merge Sort on the provided array
   * @param arr  The array we are sorting
   * @return     Nothing
   */
  public static void insertionSort(int[] arr)
  {
    for (int j = 1; j < arr.length; j++) {
      int value = arr[j]; // value is the next element to insert
      int possibleIndex = j;
      while (possibleIndex > 0 && value < arr[possibleIndex - 1])
      {
      arr[possibleIndex] = arr[possibleIndex - 1];
        possibleIndex--;
      }
    arr[possibleIndex] = value; // put value in its place!
    }
  }

}